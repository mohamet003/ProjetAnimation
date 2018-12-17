package bandeau;

public class ExempleDUtilisation {

    private final Bandeau monBandeau = new Bandeau();

    public static void main(String[] args) {
        new ExempleDUtilisation().exemple();
    }

    public void exemple() {

        Scenario s = new Scenario();

        RotationZoom rotationZoom = new RotationZoom("Bienvenu !", 50);
        Rainbow r = new Rainbow("Rainbow !", 500);
        LettreOneByOne byOne = new LettreOneByOne("One by One !", 300);
        JeuxDuPendu duPendu = new JeuxDuPendu("Hello le monde !", 500);
        Clignote c = new Clignote("Je clignote !", 200);
        Defile d = new Defile("Aurevoir", 100);

        s.AddEffect(duPendu, 1);
        s.AddEffect(rotationZoom, 1);
        s.AddEffect(byOne, 1);
        s.AddEffect(r, 1);
        s.AddEffect(c, 10);
        s.AddEffect(d, 1);

        s.playOn(monBandeau);

        /*
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        monBandeau.setMessage("Hello");
		monBandeau.sleep(1000);
		monBandeau.setMessage("On va changer de police");
		monBandeau.sleep(1000);
		monBandeau.setMessage("Monospaced 15 Bold");
		monBandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
		monBandeau.sleep(1000);
		monBandeau.setMessage("SansSerif 15");
		monBandeau.setFont(new Font("SansSerif", Font.PLAIN, 15));
		monBandeau.sleep(1000);
		monBandeau.setMessage("On va zoomer");
		monBandeau.sleep(1000);
		monBandeau.setMessage("Zoom........");
		for (int i = 5; i < 60 ; i+=5) {
			monBandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
			monBandeau.sleep(100);
		}
		monBandeau.sleep(1000);

		monBandeau.setFont(new Font("Courier new", Font.PLAIN, 15));
		monBandeau.setMessage("On va tourner");
		monBandeau.sleep(1000);
		monBandeau.setMessage("On tourne...");
		for (int i = 0; i <= 100; i++) {
			monBandeau.setRotation(2*Math.PI*i / 100);
			monBandeau.sleep(100);
		}

		monBandeau.setMessage("On va changer de couleur de fond");
		monBandeau.sleep(1000);
		monBandeau.setBackground(Color.DARK_GRAY);
		monBandeau.setMessage("On va changer de couleur");
		monBandeau.sleep(1000);
		monBandeau.setForeground(Color.YELLOW);
		monBandeau.sleep(1000);
		monBandeau.setFont(font);
		monBandeau.setForeground(fore);
		monBandeau.setBackground(back);
		monBandeau.setMessage("Termine");*/
        //System.exit(0);
    }
}
