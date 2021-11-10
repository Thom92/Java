public class Member extends Person
{
    private boolean isBasic;

    public void basic()
    {
        isBasic = true;
    }
    private void fullMemberShip()
    {
        isBasic = false;
    }

    public String getMemberType()
    {
        if(isBasic)
        {
            return "Basic membership";
        }
        else
        {
            return "Full membership";
        }
    }

    public int monthlyFee()
    {
        if (isBasic)
        {
            return 199;
        }
        else
        {
            return 299;
        }
    }
    public Member(String name, String cpr, boolean isBasic)
    {
        super(name, cpr);
        this.isBasic = isBasic;
    }


}
