package com.company;

public class methods {
database database = new database();
double sum;
double multiplication;

    public Double probabilityOfCloudy()
    {
        sum= database.cloudyTrue()+ database.cloudyFlase();
        return (double) sum/ database.totalCount();
    }
    public Double probabilityOfSunny()
    {
        sum= database.sunnyTrue()+ database.sunnyFalse();
        return (double) sum/database.totalCount();
    }
    public Double probabilityOfRainy()
    {
         sum= database.rainyTrue()+database.rainyFalse();
        return (double) sum/database.totalCount();
    }
    public double probabilityOfGoingToParty()
    {
         sum = database.cloudyTrue()+database.sunnyTrue()+database.rainyTrue();
        return (double) sum/database.totalCount();
    }
    public float probabilityOfNotGoingToParty()
    {
         sum= database.cloudyFlase()+database.sunnyFalse()+database.rainyFalse();
        return (float) sum/database.totalCount();
    }
    public  double probabilityOfSunnyAndYesParty()
    {
        sum =database.cloudyTrue()+database.sunnyTrue()+database.rainyTrue();
        return (double) database.sunnyTrue()/sum;
    }
    public  double probabilityOfSunnyNoParty()
    {
        sum = database.cloudyFlase()+database.sunnyFalse()+database.rainyFalse();
        return (double) database.sunnyFalse()/sum;
    }
    public  double probabilityOfRainyAndYesParty()
    {
        sum = database.cloudyTrue()+database.sunnyTrue()+database.rainyTrue();
        return (double) database.rainyTrue()/sum;
    }
    public double probabilityOfRainyAndNoParty()
    {
        sum = database.cloudyFlase()+database.rainyFalse()+database.sunnyFalse();
        return (double) database.rainyFalse()/sum;
    }
    public double probabilityOfCloudyAndYesParty()
    {
        sum = database.sunnyTrue()+database.cloudyTrue()+database.rainyTrue();
        return (double) database.cloudyTrue()/sum;
    }
    public double probabilityOfCloudyAndNopPart()
    {
        sum = database.cloudyFlase()+database.rainyFalse()+database.sunnyFalse();
        return (double) database.cloudyFlase()/sum;
    }


    ///probability of yes and sunny ie p(y/s)
    public  double probabilityOfYesGivenSunny()
    {
        multiplication = probabilityOfSunnyAndYesParty()*probabilityOfGoingToParty();
        return (double) multiplication/probabilityOfSunny();
    }
    public double probabilityOfNoGivenSunny()
    {
        multiplication = probabilityOfSunnyNoParty()*probabilityOfNotGoingToParty();
        return (double) multiplication/probabilityOfSunny();
    }
    public  double probabilityOfYesGivenRainy()
    {
        multiplication=probabilityOfRainyAndYesParty()*probabilityOfGoingToParty();
        return (double) multiplication/probabilityOfRainy();
    }
    public  double probabilityOfNoGivenRainy()
    {
        multiplication = probabilityOfRainyAndNoParty()*probabilityOfNotGoingToParty();
        return (double) multiplication/probabilityOfRainy();
    }
    public  double probabilityOfYesGivenCloudy()
    {
        multiplication =  probabilityOfCloudyAndYesParty()*probabilityOfGoingToParty();
        return (double) multiplication/ probabilityOfCloudy();
    }
    public  double probabilityOfNoGivenCloudy()
    {
        multiplication = probabilityOfCloudyAndNopPart()*probabilityOfNotGoingToParty();
        return (double) multiplication/probabilityOfCloudy();
    }
}
