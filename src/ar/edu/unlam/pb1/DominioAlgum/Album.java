package ar.edu.unlam.pb1.DominioAlgum;

public class Album {

	private static String selecciones[] = { "Qatar", "Ecuador", "Senegal", "Paises Bajos", "Inglaterra", "Irán", "EEUU",
			"Gales", "Argentina", "Arabia Saudita", "México", "Polonia", "Francia", "Australia", "Dinamarca", "Tunez",
			"España", "Costa Rica", "Alemania", "Japón", "Bélgica", "Canadá", "Marruecos", "Croacia", "Brasil",
			"Serbia", "Suiza", "Camerún", "Portugal", "Ghana", "Uruguay", "Corea del Sur" };

	private static Figurita figuritasDisponibles[] = new Figurita[704];
	private Figurita figuritasActuales[];

	public Album() {
		this.figuritasActuales = new Figurita[704];

	}

	public static void inicializarCodigosDeFiguritas() {
		Integer contadorFiguritas = 1;// 2
		Integer contadorSelecciones = 0;
		int indiceSelecciones = 0;
		int indiceFiguritas = 0;
// como hago iterar el ARG --> QAT --> ECU
		for (indiceFiguritas = 0; indiceFiguritas < figuritasDisponibles.length; indiceFiguritas++) {
			if (figuritasDisponibles[indiceFiguritas] != null) {
				figuritasDisponibles[indiceFiguritas].setCodigo(selecciones[contadorSelecciones] + contadorFiguritas);
			}
			if (contadorFiguritas == 22) {
				contadorSelecciones++;
				contadorFiguritas = 0;
			} else {
				contadorFiguritas++;
			}
		}
	}

	/*
	 * Por cada país debe generar 22 códigos de manera automática por ejemplo QAT1,
	 * URU12, COS10
	 */

	public static void actualizarDatosFigurita(String codigo, char grupo, String nombreJugador, double valor) {
		boolean sePudoEncontrar = false;

		for (int i = 0; i < figuritasDisponibles.length; i++) {
			if (figuritasDisponibles[i] != null && !sePudoEncontrar
					&& figuritasDisponibles[i].getCodigo().equals(codigo)) {
				sePudoEncontrar = true;
				figuritasDisponibles[i].setGrupo(grupo);
				figuritasDisponibles[i].setNombreJugador(nombreJugador);
				figuritasDisponibles[i].setValor(valor);
			}
		}
		/*
		 * En función del código de figurita, se deben actualizar los datos de la misma
		 * en figuritasDisponibles
		 */
	}

	public static Figurita getFigurita(String codigo) {
		Figurita figuritaBuscada = null;
		boolean sePudoEncontrar = false;

		for (int i = 0; i < figuritasDisponibles.length; i++) {
			if (figuritasDisponibles[i] != null && !sePudoEncontrar
					&& figuritasDisponibles[i].getCodigo().equals(codigo)) {
				figuritaBuscada = figuritasDisponibles[i];
				sePudoEncontrar = true;
			}
		}
		/*
		 * En función del código de figurita, devuelve la figurita de
		 * figuritasDisponibles
		 */
		return figuritaBuscada;
	}

	public Figurita[] comprarSobre() {
		Figurita sobre[] = new Figurita[5];

		for (int i = 0; i < sobre.length; i++) {
			if (sobre[i] == null) {
				sobre[i] = figuritasDisponibles[(int) Math.random() * 704];
			}
		}
		/*
		 * Se debe calcular y devolver 5 códigos de figurita de manera aleatoria.
		 */
		return sobre;
	}

	public void agregarFigurita(Figurita nueva) {
		boolean sePudoAgregar = false;
		
		for (int i = 0; i < figuritasActuales.length; i++) {
			if (figuritasActuales[i] == null && !sePudoAgregar) {
				figuritasActuales[i] = nueva;
				sePudoAgregar = true;
			}
		}
		/*
		 * Agrega una nueva figurita al array figuritasActuales
		 */
	}

	public void ordenarFiguritasActuales() {
		/*
		 * Debe ordenar el array figuritasActuales
		 */
	}

	public boolean elAlbumEstaCompleto() {
		/*
		 * Debe verificar que todas las figuritas disponibles estén presentes al menos
		 * una vez en las figuritas actuales
		 */
		return false;
	}

	public double calcularPorcentajeCompletado() {
		/*
		 * Debe calcular el porcentaje de figuritas del album que está completo. Para
		 * esto se debe basar en la información de las figuritasDisponibles en relación
		 * a las figuritasActuales que se tiene en el album.
		 */
		return 0.0;
	}

}
