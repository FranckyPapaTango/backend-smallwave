package rafaros.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import rafaros.backend.dao.repository.CommandeRepository;
import rafaros.backend.dao.repository.ProduitRepository;
import rafaros.backend.dao.repository.TypecommandeRepository;
import rafaros.backend.dao.repository.UtilisateurRepository;
import rafaros.backend.entities.Commande;
import rafaros.backend.entities.Produit;
import rafaros.backend.entities.Typecommande;
import rafaros.backend.entities.Utilisateur;

@SpringBootApplication
public class SmallwaveBackendApplication extends SpringBootServletInitializer implements CommandLineRunner{
	
	@Autowired     
	private RepositoryRestConfiguration restConfiguration; 
	
	@Autowired 
	private TypecommandeRepository typecommandeRepository;

	@Autowired 
	private CommandeRepository commandeRepository;
	
	@Autowired 
	private UtilisateurRepository utilisateurRepository;
	
	@Autowired 
	private ProduitRepository produitRepository;
	
	
	
	
	
	
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SmallwaveBackendApplication.class);
    }

    
	
	public static void main(String[] args) {
		SpringApplication.run(SmallwaveBackendApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(Commande.class);
		restConfiguration.exposeIdsFor(Typecommande.class);
		
		Utilisateur admin= new Utilisateur();
		admin.setLogin("k@admin");
		admin.setPassword("k@admin");
		admin.setStatut("admin");
		utilisateurRepository.save(admin);
		
		
		
		Typecommande tpc1= new Typecommande("Site e-commerce");
		Typecommande tpc2= new Typecommande("Logiciel/utilitaire software pour PC Laptop");
		Typecommande tpc3= new Typecommande("Application pour mobile Android");
		Typecommande tpc4= new Typecommande("Application web avec Serveur d'Application (Professionnel ou Particulier");
		Typecommande tpc5= new Typecommande( "Jeux");
		Typecommande tpc6= new Typecommande("Sous-traitance Informatique");
		Typecommande tpc7= new Typecommande( "Redaction de Cahier Des Charges Fonctionnelles (Gestion de Projet)");
		
		typecommandeRepository.save(tpc1);typecommandeRepository.save(tpc2);typecommandeRepository.save(tpc3);typecommandeRepository.save(tpc4);typecommandeRepository.save(tpc5);typecommandeRepository.save(tpc6);typecommandeRepository.save(tpc7);
		
		//Long idCommande=null;
		String civilite="Mme";
		String pays="France";
		String prenom="Fara";
		String nom="Ramanantsoa";
		String nomProduit="Fashion Buziness CMS";
		String descriptionProduit="Application web de Gestion de l'activité de vente de lingerie fine en ligne";
		String phone = "";
		String instantMessenger = "";
		String email="fara-nambinina-rama@gmail.com";
		String deadline="3 mois";
		String budget="2 500 euros";
		String pathDle="";	

		Commande c1= new Commande(civilite,pays,prenom,nom,nomProduit,descriptionProduit,phone,instantMessenger,email,deadline,budget,pathDle,tpc4);
		
		commandeRepository.save(c1);
		
		
		
		//Long idProduit;
		String title="SITE WEB PHP5";
		Double price=(double) 551.00 ;
		String description="E-Commerce + base de données , sites pro + cms personalisé";
		Boolean isAvailable=true;
		String image="./assets/images/photos_produits/siteECommerce.jpg";//frontend assets image path
		String outsideLink=null;
		String category="web";
		Produit p1=new Produit(title, price, description,isAvailable,image,outsideLink,category);
		
		//Long idProduit;
		 title="SITE PRO JAVA EE A ARCHITECTURE N-TIERS AVEC CONTENEUR LEGER";
		 price=(double) 3600.00 ;
		 description="(moyen traffic)(Serveur TOMCAT+SPRING CORE)+Base de données (OBJECTDB ou MYSQL8 ou ou ORACLE 12G ou POSTGRESQL10) +CMS";
		 isAvailable=true;
		 image="./assets/images/photos_produits/SITE PRO JAVA EE AVEC CONTENEUR LEGER.png";//frontend assets image path
		 outsideLink=null;
		 category="web app";
		 Produit p2=new Produit(title, price, description,isAvailable,image,outsideLink,category);
		
		//Long idProduit;
		 title="SITE PRO JAVA EE A ARCHITECTURE REPARTIE AVEC CONTENEUR LOURD";
		 price=(double) 6000.00 ;
		 description="(gros traffic) (Serveur d'application GLASSFISH+EJB+JSP)+ base de données (MYSQL7 ou ORACLE 12G ou POSTGRESQL10) +CMS";
		 isAvailable=true;
		 image="./assets/images/photos_produits/SITE PRO JAVA EE AVEC CONTENEUR LOURD.png";//frontend assets image path
		 outsideLink=null;
		 category="web app";
		Produit p3=new Produit(title, price, description,isAvailable,image,outsideLink,category);
		
		//Long idProduit;
		 title="LOGAID (Version pour PC)";
		 price=(double) 540.00 ;
		 description="(APPLICATION ERP DE GESTION D'ACTIVITE DE TRANSPORT/LIVRAISON";
		 isAvailable=true;
		 image="./assets/images/photos_produits/images.jpg";//frontend assets image path
		 outsideLink=null;
		 category="tool";
		Produit p4=new Produit(title, price, description,isAvailable,image,outsideLink,category);
		
		
		//Long idProduit;
		 title="LOGITRA";
		 price=(double) 3195.50;
		 description="LOGICIEL DE GESTION DE TRAVAUX ET DE CALCUL DE COÛT DE CONSTRUCTION (BTP) (produit en cours de réalisation) ";
		 isAvailable=false;//PRODUIT NON DISPONIBLE
		 image="./assets/images/photos_produits/images2.jpg";//frontend assets image path
		 outsideLink=null;
		 category="tool";
		Produit p5=new Produit(title, price, description,isAvailable,image,outsideLink,category);
		
		
		//Long idProduit;
		 title="EUROMILLION PLAYER HELPER";
		 price=(double) 3.50;
		 description="LOGICIEL D'ANALYSES STATISTIQUES ET DE STRATEGIES pour aider à choisir sa Combinaison";
		 isAvailable=true;//PRODUIT NON DISPONIBLE
		 image="./assets/images/euromil-player-helper.png";//frontend assets image path
		 outsideLink=null;
		 category="tool";
		Produit p6=new Produit(title, price, description,isAvailable,image,outsideLink,category);
	
		
		//Long idProduit;
		 title="DICTATE";
		 price=(double) 1.80;
		 description="Dictez tout par la voie (Application Android sur Google Play Store)";
		 isAvailable=true;//PRODUIT NON DISPONIBLE
		 image="./assets/images/photos_produits/dictate.gif";//frontend assets image path
		 outsideLink="https://play.google.com/store/apps/details?id=com.rafaros.fileselector";
		 category="smartphone tool";
		Produit p7=new Produit(title, price, description,isAvailable,image,outsideLink,category);
		
		
		//Long idProduit;
		 title="FORGAME 2D-3D";
		 price=(double) 0.00;
		 description="Jeux 2D / 3D (Application Android sur Google Play Store)";
		 isAvailable=true;//PRODUIT NON DISPONIBLE
		 image="./assets/images/photos_produits/forgame.gif";//frontend assets image path
		 outsideLink="https://play.google.com/store/apps/details?id=com.rafaros.game";
		 category="smartphone tool";
		Produit p8=new Produit(title, price, description,isAvailable,image,outsideLink,category);
		
		
		//Long idProduit;
		 title="LOGAID";
		 price=(double) 38.40;
		 description="Utilitaire pour livrez avec aisance (Application Android sur Google Play Store)";
		 isAvailable=true;//PRODUIT NON DISPONIBLE
		 image="./assets/images/photos_produits/logaid.gif";//frontend assets image path
		 outsideLink="https://play.google.com/store/apps/details?id=com.smallwave.logaid";
		 category="smartphone tool";
		Produit p9=new Produit(title, price, description,isAvailable,image,outsideLink,category);
		
		produitRepository.save(p1);produitRepository.save(p2);produitRepository.save(p3);produitRepository.save(p4);produitRepository.save(p5);
		produitRepository.save(p6);produitRepository.save(p7);produitRepository.save(p8);produitRepository.save(p9);
		
		
	}

}
