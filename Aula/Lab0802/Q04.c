#include <stdio.h>
#include <string.h>

char *readString(char *string)
{
    fgets(string, sizeof(string), stdin);
    string[strcspn(string, "\n\r")] = 0;
    return string;
}

int contadorRecursivo(char *string, int index)
{
    if (string[index] == '\0')
    {
        return 0;
    }

    if (string[index] >= 'A' && string[index] <= 'Z')
    {
        return 1 + contadorRecursivo(string, index + 1);
    }
    else
    {
        return contadorRecursivo(string, index + 1);
    }
}

int main()
{
    char frase[1000];

    fgets(frase, sizeof(frase), stdin);

    while (strcmp(frase, "FIM\n") != 0)
    {

        int contador = contadorRecursivo(frase, 0);

        printf("%d\n", contador);

        fgets(frase, sizeof(frase), stdin);
    }
    return 0;
}
