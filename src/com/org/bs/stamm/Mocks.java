package com.org.bs.stamm;

import java.util.Vector;
import com.org.bs.stamm.News;

public class Mocks {

	private static Mocks instance;
	
	private Vector<News> news = new Vector<News>();
	private Vector<Event> events = new Vector<Event>();
	
	public static void initInstance() {
		if(instance == null)
			instance = new Mocks();
	}
	
	
	private Mocks() {
		
		news.addElement(new News(
				"Deux nouvelles troupes crées en Janvier", 
				"Tous mes sens sont émus d'une volupté douce et pure, comme l'haleine du matin dans cette saison délicieuse. Seul, au milieu d'une contrée qui semble fait exprès pour un coeur tel que mien, j'y goûte à longs traits l'ivresse de la vie. Je suis si heureux, mon ami, si absorbé dans le sentiment de ma paisible existence, que mon art en souffre. Incapable de dessiner le mointre trait, la plus faible ébauche, jamais pourtant je ne fus si grand peintre.", 
				"Michel", 
				"12.12.2012"
		));
		
		news.addElement(new News(
				"Les résultats du PCDMD sont publiés!", 
				"Quand mon vallon chéri se couvre autour de moi d'une légère vapeur; qu'au-dessus de ma tête le soleil de midi darde ses rayons embrasés sur la sombre voûte de mon bois, au fond duquel, comme d'un sanctuaire, il introduit à peine une tremblante lumière; qu'étendu sur le gazon touffu, à la chute d'un ruisseau, je découvre avec ravissement une multitude de plantes, de fleurs d'une délicatesse infinie; que je vois s'agiter entre les brins d'herbe des milliers de vermisseaux, d'insectes, de moucherons, aux formes variées et innombrables; que j'entends résonner à mon oreille le murmure confus de ce petit monde; quand l'auguste présence de l'Être tout-puissant qui créa l'homme à son image, le souffle vivifiant du Dieu d'amour et de bonté qui nous porte et nous soutient sur un océan de délices éternels, me pénètrent de toutes parts, et que le ciel et la terre se réfléchissent dans mon âme sous le traits d'une amante adorée, alors je soupire et me dis: Oh!", 
				"Bernard",
				"24.11.2012"
		));
			
		news.addElement(new News(
				"Le vin chaud du mat ce mercredi",
				"Que ne puis-je exprimer ce que je sens si vivement! Ces émotions brûlantes, que ne m'est-il donné de les peindre en traits de flamme! Mais - mon ami - les forces me manquent; je succombe sous la grandeur, sous la majesté de ces sublimes merveilles! Tous mes sens sont émus d'une volupté douce et pure, comme l'haleine du matin dans cette saison délicieuse. Seul, au milieu d'une contrée qui semble fait exprès pour un coeur tel que mien, j'y goûte à longs traits l'ivresse de la vie.",
				"Michel",
				"02.11.2012"
		));
			
		news.addElement(new News(
				"Nouvel an",
				"Je suis si heureux, mon ami, si absorbé dans le sentiment de ma paisible existence, que mon art en souffre. Incapable de dessiner le mointre trait, la plus faible ébauche, jamais pourtant je ne fus si grand peintre.",
				"Serge",
				"01.11.2012"
		));
		
		
		events.addElement(new Event(
				"Stamm de Noel",
				"Que ne puis-je exprimer ce que je sens si vivement! Ces émotions brûlantes, que ne m'est-il donné de les peindre en traits de flamme!",
				"Christian",
				"18.12.2012",
				"18.12.2012",
				"20h",
				"23h"
		));
		
		events.addElement(new Event(
				"RASS de Janvier",
				"Je suis si heureux, mon ami, si absorbé dans le sentiment de ma paisible existence, que mon art en souffre.",
				"Jean",
				"12.01.2013",
				"12.01.2013",
				"14h30",
				"16h"
		));
		
		events.addElement(new Event(
				"Mimosas du bonheur",
				"Tous mes sens sont émus d'une volupté douce et pure, comme l'haleine du matin dans cette saison délicieuse.",
				"Roger",
				"21.01.2013",
				"22.01.2013",
				"",
				""
		));
	}
	
	public static Mocks getInstance() {
		return instance;
	}
	
	
	
	
	
	public Vector<News> getNews() {
		return news;
	}
	
	public String[] getNewsTitles() {
		String[] newsTitles = new String[news.size()];
		
		for (int i = 0; i<news.size(); i++) {
			newsTitles[i] = news.get(i).getTitle();
		}
		return newsTitles;
	}
	
	
	
	
	
	public Vector<Event> getEvents() {
		return events;
	}
	
	public String[] getEventsTitles() {
		String[] eventTitles = new String[events.size()];
		
		for (int i = 0; i<events.size(); i++) {
			eventTitles[i] = events.get(i).getTitle();
		}
		return eventTitles;
	}
}
