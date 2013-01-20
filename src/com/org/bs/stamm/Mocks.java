package com.org.bs.stamm;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

import com.google.android.gms.maps.model.LatLng;

public class Mocks {

	
	static final LatLng VALVERT = new LatLng(46.521999,6.66696);
	static final LatLng CHALET_A_GOBET = new LatLng(46.564793,6.689011);
	static final LatLng MALADIERE = new LatLng(46.517547,6.604631);
	static final LatLng EPALINGES = new LatLng(46.54786,6.675573);
	static final LatLng SAUVABELIN = new LatLng(46.53254,6.640669);
	
	private static Mocks instance;
	
	private Vector<News> news = new Vector<News>();
	private Vector<Event> events = new Vector<Event>();
	private Vector<File> files = new Vector<File>();
	private Vector<Activite> activities = new Vector<Activite>();
	
	public static void initInstance() {
		if(instance == null)
			instance = new Mocks();
	}
	
	
	private Mocks() {
		
		
		/*********************************************
		 * News
		 */
		String[] fonctions3 = {"cu"};
		String[] branches3 = {"toutes"};
		
		news.addElement(new News(
				"Délai de rendu des dossiers de camp", 
				"Chers CU, attention! Cette année le rendu des dossiers JS est placé relativement tot. " +
				"Le délai est au 13 février. Pensez aussi au fait que les deux semaines précédentes c'est " +
				"les vacances scolaires et que votre EM ne sera pas forcément présent! Bon travail et merci " +
				"pour votre motivation!",
				"Cristina, votre coach",
				new GregorianCalendar(2013, 1, 21),
				new Vector<String>(Arrays.asList(fonctions3)),
				new Vector<String>(Arrays.asList(branches3))
		));

		String[] fonctions1 = {"toutes"};
		String[] branches1 = {"toutes"};
		
		news.addElement(new News(
				"Rangement des locaux", 
				"Le WE prochain il y aura une visite des officiels de la ville de Lausanne. " +
				"Afin de montrer un bonne image, chaque unité est tenu de ranger les locaux " +
				"à la perfection. N'oubliez pas que ces locaux sont les seuls que nous possédons " +
				"et qu'il est primordial d'en prendre soin si on ne veut pas se retourver dehors.", 
				"Le CDT", 
				new GregorianCalendar(2013, 1, 8),
				new Vector<String>(Arrays.asList(fonctions1)),
				new Vector<String>(Arrays.asList(branches1))
		));
		
		String[] fonctions2 = {"cu", "adj", "cp"};
		String[] branches2 = {"eclaireurs"};
		
		news.addElement(new News(
				"Trone of Stamm commence!", 
				"Préparez-vous, dès mercredi commence l'épique aventure de Throne of Stamm. La troupe " +
				"qui se sera montrée la plus témeraire pourra accèder au mythique trône. Chauffez votre " +
				"EM si vous voulez avoir une chance de vous aligner aux meilleurs!",
				"Christian & Guggi",
				new GregorianCalendar(2013, 1, 4),
				new Vector<String>(Arrays.asList(fonctions2)),
				new Vector<String>(Arrays.asList(branches2))
		));
		
		news.addElement(new News(
				"Deux nouvelles troupes crées en Janvier", 
				"Tous mes sens sont émus d'une volupté douce et pure, " +
				"comme l'haleine du matin dans cette saison délicieuse. " +
				"Seul, au milieu d'une contrée qui semble fait exprès pour " +
				"un coeur tel que mien, j'y goûte à longs traits l'ivresse " +
				"de la vie. Je suis si heureux, mon ami, si absorbé dans le " +
				"sentiment de ma paisible existence, que mon art en souffre. " +
				"Incapable de dessiner le mointre trait, la plus faible ébauche, " +
				"jamais pourtant je ne fus si grand peintre.", 
				"Michel", 
				new GregorianCalendar(2012, 12, 12),
				new Vector<String>(Arrays.asList(fonctions1)),
				new Vector<String>(Arrays.asList(branches1))
		));
		
		news.addElement(new News(
				"Les résultats du PCDMD sont publiés!", 
				"Le première Classe a eu lieu du 30 novembre au 2 décembre 2012. " +
				"Lors de ce week-end, de nombreux équipiers et équipières de 14 ans " +
				"ont obtenu leur 1ère Classe à Bercher après plus de 3 mois de préparation. " +
				"Félicitations pour leur entrain et leur motivation sans faille lors de ce week-end frisquet.", 
				"Le Secrétaire-général",
				new GregorianCalendar(2012, 12, 4),
				new Vector<String>(Arrays.asList(fonctions1)),
				new Vector<String>(Arrays.asList(branches1))
		));
			
		news.addElement(new News(
				"Le vin chaud du mat ce mercredi",
				"Que ne puis-je exprimer ce que je sens si vivement! Ces émotions brûlantes, " +
				"que ne m'est-il donné de les peindre en traits de flamme! Mais - mon ami - " +
				"les forces me manquent; je succombe sous la grandeur, sous la majesté de ces " +
				"sublimes merveilles! Tous mes sens sont émus d'une volupté douce et pure, " +
				"comme l'haleine du matin dans cette saison délicieuse. Seul, au milieu d'une " +
				"contrée qui semble fait exprès pour un coeur tel que mien, j'y goûte à longs " +
				"traits l'ivresse de la vie.",
				"Michel",
				new GregorianCalendar(2012, 11, 2),
				new Vector<String>(Arrays.asList(fonctions1)),
				new Vector<String>(Arrays.asList(branches1))
		));
			
		news.addElement(new News(
				"Nouvel an",
				"Je suis si heureux, mon ami, si absorbé dans le sentiment de ma paisible " +
				"existence, que mon art en souffre. Incapable de dessiner le mointre trait, " +
				"la plus faible ébauche, jamais pourtant je ne fus si grand peintre.",
				"Serge",
				new GregorianCalendar(2012, 11, 1),
				new Vector<String>(Arrays.asList(fonctions1)),
				new Vector<String>(Arrays.asList(branches1))
		));
		
		
		
		/*********************************************
		 * Events
		 */
		
		events.addElement(new Event(
				"Stamm de Noel",
				"Que ne puis-je exprimer ce que je sens si vivement! Ces émotions brûlantes, " +
				"que ne m'est-il donné de les peindre en traits de flamme!",
				"Christian",
				new GregorianCalendar(2012, 12, 18, 20, 0),
				new GregorianCalendar(2012, 12, 18, 23, 0)
		));

		
		events.addElement(new Event(
				"RASS de Janvier",
				"Je suis si heureux, mon ami, si absorbé dans le sentiment de ma paisible existence, " +
				"que mon art en souffre.",
				"Jean",
				new GregorianCalendar(2013, 1, 12, 14, 30),
				new GregorianCalendar(2013, 1, 12, 16, 00)
		));

		
		events.addElement(new Event(
				"Mimosas du bonheur",
				"Tous mes sens sont émus d'une volupté douce et pure, comme l'haleine du matin dans " +
				"cette saison délicieuse.",
				"Roger",
				new GregorianCalendar(2013, 1, 21),
				new GregorianCalendar(2013, 1, 21)
		));
		
		
		events.addElement(new Event(
				"Info théâtrale",
				"Merci de tous vous rendre dans la cour à 21h précise pour une information concernant la théâtrale." +
				"Les scènes seront répartie, ainsi, envoyez un adjoint si vous ne pouvez pas être présent.",
				"Guggi",
				new GregorianCalendar(2013, 1, 23, 21, 0),
				new GregorianCalendar(2013, 1, 23, 21, 30)
		));
		
		events.addElement(new Event(
				"Camps d'été 2ème branche",
				"Les camps d'été 2ème branche auront lieu du 5 au 19 juillet alors que les camps 1ère " +
				"branche auront lieu du 12 au 19 juillet. Pour la 3ème branche, merci de vous référer à vos CTs.",
				"Roger",
				new GregorianCalendar(2013, 7, 5),
				new GregorianCalendar(2013, 7, 19)
		));
		
		events.addElement(new Event(
				"Camps d'été 1ère branche",
				"Les camps d'été 2ème branche auront lieu du 5 au 19 juillet alors que les camps 1ère " +
				"branche auront lieu du 12 au 19 juillet. Pour la 3ème branche, merci de vous référer à vos CTs.",
				"Roger",
				new GregorianCalendar(2013, 7, 12),
				new GregorianCalendar(2013, 7, 19)
		));
		
		
		
		/*********************************************
		 * Files
		 */
		files.addElement(new File(
				"Inscription cours A1",
				"inscription_cours_a1.pdf",
				"pdf"
		));
		
		files.addElement(new File(
				"Inscription cours A2",
				"inscription_cours_a2.pdf",
				"pdf"
		));
		
		files.addElement(new File(
				"Inscription cours B1",
				"inscription_cours_b1.pdf",
				"pdf"
		));	
		
		files.addElement(new File(
				"Inscription cours B2",
				"inscription_cours_b2.pdf",
				"pdf"
		));
		
		
		
		/*********************************************
		 * Files
		 */
		activities.addElement(new Activite(
				"Berisal", 
				"Panthères", 
				"Séance luge!",
				new GregorianCalendar(2013, 1, 26, 14, 00),
				new GregorianCalendar(2013, 1, 26, 17, 00),
				CHALET_A_GOBET
				
		));
		
		activities.addElement(new Activite(
				"Berisal", 
				"Faucons", 
				"Amenez des nouveaux",
				new GregorianCalendar(2013, 1, 26, 14, 00),
				new GregorianCalendar(2013, 1, 26, 17, 00),
				VALVERT
		));
		
		
		activities.addElement(new Activite(
				"Manloud", 
				"troupe", 
				"Première séance pour le film de trimestre, amenez un pic-nic",
				new GregorianCalendar(2013, 1, 26, 9, 00),
				new GregorianCalendar(2013, 1, 26, 17, 00),
				SAUVABELIN
		));
		
		activities.addElement(new Activite(
				"Zanfleuron", 
				"Bouquetins", 
				"Vente de patisserie",
				new GregorianCalendar(2013, 1, 26, 8, 00),
				new GregorianCalendar(2013, 1, 26, 12, 00),
				SAUVABELIN
		));
		
		
		activities.addElement(new Activite(
				"Clairière", 
				"meute", 
				"Ouais!",
				new GregorianCalendar(2013, 1, 26, 14, 00),
				new GregorianCalendar(2013, 1, 26, 17, 00),
				MALADIERE
		));		
		
		activities.addElement(new Activite(
				"Armina", 
				"troupe", 
				"Ouais!",
				new GregorianCalendar(2013, 2, 2, 14, 00),
				new GregorianCalendar(2013, 2, 2, 17, 00),
				EPALINGES
		));
	}
	
	public static Mocks getInstance() {
		return instance;
	}
	
	
	/*********************************************
	 * News
	 */
	public Vector<News> getNews() {
		return news;
	}
	
	public String[] getNewsTitles(String function, String branch) {
		return getNewsTitles(function, branch, 10);
	}
	
	public String[] getNewsTitles(String function, String branch, int numberOfItems) {
		numberOfItems = Math.min(numberOfItems, news.size());
		Vector<String> newsTitles = new Vector<String>();
		
		for (int i = 0; i<numberOfItems; i++) {
			if(		(news.get(i).getFonctions().contains(function) || function.equals("toutes") || news.get(i).getFonctions().contains("toutes") ) && 
					(news.get(i).getBranches().contains(branch) || branch.equals("toutes") || news.get(i).getBranches().contains("toutes"))
					) {
				newsTitles.add(news.get(i).getTitle());
			}
		}
		
		if(newsTitles.isEmpty())
			newsTitles.add("Désolé, il n'y a pas de news pour l'instant");
		
		String[] content = new String[newsTitles.size()];
		
		return (String[]) newsTitles.toArray(content);
	}
	
	
	
	
	/*********************************************
	 * Events
	 */
	public Vector<Event> getEvents() {
		return events;
	}
	
	public String[] getEventsTitles() {
		return getEventsTitles(10);
	}
	
	public String[] getEventsTitles(int numberOfItems) {
		numberOfItems = Math.min(numberOfItems, events.size());
		String[] eventTitles = new String[numberOfItems];
		
		for (int i = 0; i<numberOfItems; i++) {
			eventTitles[i] = events.get(i).getTitle();
		}
		return eventTitles;
	}
	
	/*********************************************
	 * Files
	 */
	public Vector<File> getFiles() {
		return files;
	}
	
	public String[] getFilesNames() {
		String[] filesNames = new String[files.size()];
		
		for (int i = 0; i<files.size(); i++) {
			filesNames[i] = files.get(i).getName();
		}
		return filesNames;
	}

	
	/*********************************************
	 * Activities
	 */
	public Vector<Activite> getThisWeActivities() {
		
		return activities;
//		Vector<Activite> thisWEActivities = new Vector<Activite>();
//		Activite a = null;
//		Calendar now = Calendar.getInstance();
//		
//		for(Integer i=0; i<activities.size(); i++) {
//			a = activities.get(i);
//			if(	a.getStartDate().get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY &&
//					((a.getStartDate().get(Calendar.DAY_OF_YEAR) - now.get(Calendar.DAY_OF_YEAR)) >= 0) &&
//					(a.getStartDate().get(Calendar.DAY_OF_YEAR) - now.get(Calendar.DAY_OF_YEAR)) < 7) {
//				thisWEActivities.add(a);
//			}
//		}
//		
//		return thisWEActivities;
	}
	
	public String[] getActivitiesTitles() {
		Integer numberOfItems = getThisWeActivities().size();
		String[] activitiesTitles = new String[numberOfItems];
		
		activitiesTitles[0] = "Afficher la carte";
		
		for (int i = 0; i<numberOfItems-1; i++) {
			activitiesTitles[i+1] = getThisWeActivities().get(i).getTitle();
		}
		return activitiesTitles;
	}
	
}
