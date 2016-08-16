import java.util.Objects;


/**
 * Created by davehochstrasser on 8/15/16.
 */
public class Main {
    public static void main(String[] args) {
        Kata kata = new Kata();
        String dood = new String();
        String edood = new String();

        dood = "example";
        edood = kata.explode(dood);
        System.out.printf("explode(\"%s\") ->\"%s\"\n", dood, edood);

        dood = "cat";
        edood = kata.explode(dood);
        System.out.printf("explode(\"%s\") ->\"%s\"\n", dood, edood);

        dood = "";
        edood = kata.explode(dood);
        System.out.printf("explode(\"%s\") ->\"%s\"\n", dood, edood);

        dood = "doggy";
        edood = kata.explode(dood);
        System.out.printf("explode(\"%s\") ->\"%s\"\n", dood, edood);

        dood = "porch";
        edood = kata.explode(dood);
        System.out.printf("explode(\"%s\") ->\"%s\"\n", dood, edood);

        dood = "purrrrfect";
        edood = kata.explode(dood);
        System.out.printf("explode(\"%s\") ->\"%s\"\n", dood, edood);

        String guy = new String();
        String guys = new String();

        guy = "candy";
        guys = kata.notString(guy);
        System.out.printf("notString(\"%s\") ->\"%s\"\n", guy, guys);

        guy = "x";
        guys = kata.notString(guy);
        System.out.printf("notString(\"%s\") ->\"%s\"\n", guy, guys);

        guy = "not bad";
        guys = kata.notString(guy);
        System.out.printf("notString(\"%s\") ->\"%s\"\n", guy, guys);

        guy = "not";
        guys = kata.notString(guy);
        System.out.printf("notString(\"%s\") ->\"%s\"\n", guy, guys);

        guy = "not knot";
        guys = kata.notString(guy);
        System.out.printf("notString(\"%s\") ->\"%s\"\n", guy, guys);

        guy = "snot";
        guys = kata.notString(guy);
        System.out.printf("notString(\"%s\") ->\"%s\"\n", guy, guys);

       //String kit = new String();
       //int sum = 0;
       //
       //kit = "kitten";
       //sum = 1;
       //System.out.printf("missingChar(\"%s\", %s) ->\"%s\"\n", kit, sum);
       //System.out.printf(" -> %s\n",sum);
        // System.out.println("kata.missingChar(kitten, 1)=>") + kata.missingChar("kitten",1));
        System.out.println("Kata.missingChar(\"kitten\", 1) -> " + Kata.missingChar("kitten", 1));
        System.out.println("Kata.missingChar(\"kitten\", o) -> " + Kata.missingChar("kitten", 0));
        System.out.println("Kata.missingChar(\"kitten\", 4) -> " + Kata.missingChar("kitten", 4));
        System.out.println("Kata.missingChar(\"kitten\", 3) -> " + Kata.missingChar("kitten", 3));
        System.out.println("Kata.missingChar(\"kitten\", 2) -> " + Kata.missingChar("kitten", 2));
        System.out.println("Kata.missingChar(\"kitten\", 5) -> " + Kata.missingChar("kitten", 5));

        System.out.println("Kata.frontBack(\"code\") -> " + Kata.frontBack("code"));
        System.out.println("Kata.frontBack(\"a\") -> " + Kata.frontBack("a"));
        System.out.println("Kata.frontBack(\"ab\") -> " + Kata.frontBack("ab"));
        System.out.println("Kata.frontBack(\"dodo\") -> " + Kata.frontBack("dodo"));
        System.out.println("Kata.frontBack(\"parlay\") -> " + Kata.frontBack("parlay"));
        System.out.println("Kata.frontBack(\"whiner\") -> " + Kata.frontBack("whiner"));

        System.out.println("Kata.front3(\"Java\") -> " + Kata.front3("Java"));
        System.out.println("Kata.front3(\"chocolate\") -> " + Kata.front3("chocolate"));
        System.out.println("Kata.front3(\"adc\") -> " + Kata.front3("abc"));
        System.out.println("Kata.front3(\"fudge\") -> " + Kata.front3("fudge"));
        System.out.println("Kata.front3(\"Johnny\") -> " + Kata.front3("Johnny"));
        System.out.println("Kata.front3(\"monsoon\") -> " + Kata.front3("monsoon"));

        System.out.println("Kata.backAround(\"cat\") -> " + Kata.backAround("cat"));
        System.out.println("Kata.backAround(\"hello\") -> " + Kata.backAround("hello"));
        System.out.println("Kata.backAround(\"a\") -> " + Kata.backAround("a"));
        System.out.println("Kata.backAround(\"pig\") -> " + Kata.backAround("pig"));
        System.out.println("Kata.backAround(\"drugs\") -> " + Kata.backAround("drugs"));
        System.out.println("Kata.backAround(\"booze\") -> " + Kata.backAround("booze"));

        System.out.println("Kata.front22(\"kitten\") -> " + Kata.front22("kitten"));
        System.out.println("Kata.front22(\"ha\") -> " + Kata.front22("ha"));
        System.out.println("Kata.front22(\"abc\") -> " + Kata.front22("abc"));
        System.out.println("Kata.front22(\"jerky\") -> " + Kata.front22("jerky"));
        System.out.println("Kata.front22(\"toilet\") -> " + Kata.front22("toilet"));
        System.out.println("Kata.front22(\"literal\") -> " + Kata.front22("literal"));

        System.out.println("Kata.delDel(\"adelbc\") -> " + Kata.delDel("adelbc"));
        System.out.println("Kata.delDel(\"adelhello\") -> " + Kata.delDel("adelhello"));
        System.out.println("Kata.delDel(\"adedbc\") -> " + Kata.delDel("adedbc"));
        System.out.println("Kata.delDel(\"adelfonz\") -> " + Kata.delDel("adelfonz"));
        System.out.println("Kata.delDel(\"adeli\") -> " + Kata.delDel("adeli"));
        System.out.println("Kata.delDel(\"aldell\") -> " + Kata.delDel("aldell"));

        System.out.println("Kata.startOz(\"ozymandias\") -> " + Kata.startOz("ozymandias"));
        System.out.println("Kata.startOz(\"bzoo\") -> " + Kata.startOz("bzoo"));
        System.out.println("Kata.startOz(\"oxx\") -> " + Kata.startOz("oxx"));
        System.out.println("Kata.startOz(\"kitten\") -> " + Kata.startOz("kitten"));
        System.out.println("Kata.startOz(\"ozenge\") -> " + Kata.startOz("ozenge"));
        System.out.println("Kata.startOz(\"ozy\") -> " + Kata.startOz("ozy"));

        System.out.println("Kata.endUp(\"hello\") -> " + Kata.endUp("hello"));
        System.out.println("Kata.endUp(\"hi there\") -> " + Kata.endUp("hi there"));
        System.out.println("Kata.endUp(\"hi\") -> " + Kata.endUp("hi"));
        System.out.println("Kata.endUp(\"i\") -> " + Kata.endUp("i"));
        System.out.println("Kata.endUp(\"marshmello\") -> " + Kata.endUp("marshmello"));
        System.out.println("Kata.endUp(\"fail\") -> " + Kata.endUp("fail"));











    }
}


