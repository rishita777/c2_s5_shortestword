public class shortestWord
{
    public String findshortestWord(String[] words)
    {
        int index=0;
        int noOfChar=words[0].length();
        for(int i=0;i<words.length;i++)
        {
            if(words[i].length()<noOfChar)
            {
                index=i;
//                noOfChar=words[i].length();
            }
        }


        return words[index];
    }

    public static void main(String[] args)
    {
        shortestWord obj=new shortestWord();
        String[] words={"java", "Programming", "Language"};
        System.out.println("The Shortest Word is :-  " +obj.findshortestWord(words));

    }
}
