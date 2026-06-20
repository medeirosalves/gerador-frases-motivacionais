import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String[] virtudes = {
                "A disciplina",
                "A persistência",
                "A coragem",
                "A determinação",
                "A paciência",
                "A humildade",
                "A dedicação",
                "A confiança",
                "A resiliência",
                "A consistência",
                "O foco",
                "A vontade de aprender"
        };

        String[] acoes = {
                "é a chave para conquistar",
                "permite alcançar",
                "ajuda a construir",
                "torna possível superar",
                "abre caminho para",
                "fortalece a busca por",
                "é fundamental para atingir",
                "faz a diferença na conquista de",
                "contribui para alcançar",
                "é o primeiro passo para"
        };

        String[] objetivos = {
                "grandes objetivos.",
                "o sucesso a longo prazo.",
                "uma vida melhor.",
                "novas oportunidades.",
                "resultados extraordinários.",
                "sonhos que parecem distantes.",
                "uma carreira de sucesso.",
                "mudanças positivas.",
                "o crescimento pessoal.",
                "um futuro brilhante."
        };

        Random random = new Random();

        String virtude = virtudes[random.nextInt(virtudes.length)];
        String acao = acoes[random.nextInt(acoes.length)];
        String objetivo = objetivos[random.nextInt(objetivos.length)];

        System.out.println("\n Frase sorteada: " + virtude + " " + acao + " " + objetivo);
    }
}