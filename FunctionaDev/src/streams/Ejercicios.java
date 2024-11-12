package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ejercicios {

	public static void main(String[] asrg) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
		cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
		cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
		cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
		cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));
		
//		Obtener la cantidad de cursos con una duración mayor a 5 horas.
		Long cantMayor = cursos.stream()
								.filter(curso -> curso.getDuracion() > 5.0f)
								.count();
		System.out.println("Cursos con duración mayor a 5 hrs: " + cantMayor);
		
//		Obtener la cantidad de cursos con una duración menor a 2 horas.
		Long cantMenor = cursos.stream()
								.filter(curso -> curso.getDuracion() < 2.0f)
								.count();
		System.out.println("Cursos con duración menor a 2 hrs: " + cantMenor);
		
//		Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.
		cursos.stream()
				.filter(curso -> curso.getVideos() > 50)
				.forEach(curso -> System.out.println(curso.getTitulo()));
		
//		Mostrar en consola el título de los 3 cursos con mayor duración.
		Comparator<Curso> mayorDuracion = Comparator.comparing(curso -> curso.getDuracion());
		cursos.stream()
				.sorted( mayorDuracion.reversed() )
				.limit(3)
				.forEach(curso -> System.out.println(curso.getTitulo()));
			
//		Mostrar en consola la duración total de todos los cursos.
		cursos.stream()
				.forEach(curso -> System.out.println("Duración: " + curso.getDuracion()));
		
//		Mostrar en consola todos aquellos libros que superen el promedio en cuanto a duración se refiere.
//		Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500.
		cursos.stream()
				.filter(curso -> curso.getAlumnos() < 500)
				.forEach(curso -> System.out.println("** " + curso.getDuracion()));
		
//		Obtener el curso con mayor duración.
		Optional<Curso> cursoLargo = cursos.stream()
							.max(Comparator.comparing(curso -> curso.getDuracion()));
		System.out.println(cursoLargo);
		
//		Crear una lista de Strings con todos los titulos de los cursos.
		List<String> titles = cursos.stream()
									.map(curso -> curso.getTitulo())
									.toList();
		System.out.println(titles);
	}
}

class Curso {

    private String titulo;
    private float duracion; //Expresada en horas
    private int videos; //cantidad de vídeos
    private int alumnos; //Cantidad de alumnos

    public Curso(String titulo, float duracion, int videos, int alumnos) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.videos = videos;
        this.alumnos = alumnos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public int getVideos() {
        return videos;
    }

    public void setVideos(int videos) {
        this.videos = videos;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", duracion=" + duracion + ", videos=" + videos + ", alumnos=" + alumnos
				+ "]";
	}

}