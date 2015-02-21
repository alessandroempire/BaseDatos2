import java.sql.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hibernate one to one (XML mapping)");
		Session session = HibernateUtil.getSessionFactory().openSession();
 
		session.beginTransaction();
 
		Stock stock = new Stock();
 
		stock.setStockCode("4715");
		stock.setStockName("GENM");
 
		StockDetail stockDetail = new StockDetail();
		stockDetail.setCompName("GENTING Malaysia");
		stockDetail.setCompDesc("Best resort in the world");
		stockDetail.setRemark("Nothing Special");
                Date date = new Date(1992, 3, 1);
		stockDetail.setListedDate(date);
 
		stock.setStockDetail(stockDetail);
		stockDetail.setStock(stock);
 
		session.save(stock);
		session.getTransaction().commit();
                
                consulta1("", session);
 
		System.out.println("Done");
	}
        
        public static List consulta1(String nombre_promocion, Session session){
        System.out.println("CONSULTA1");
        
        String hql = "select p.stockDetail.compName " +
                     "FROM Stock p " +
                     "inner join p.stockDetail ";
        
        Query q = session.createQuery(hql);
        List list = q.list();
        
        //Imprimir el resultado
        for (int i=0; i < list.size(); i++){
            String info = list.get(i).toString();
            System.out.println(info);
        }
        
        return list; 
    }
}
