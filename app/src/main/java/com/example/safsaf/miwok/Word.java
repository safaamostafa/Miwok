package com.example.safsaf.miwok;

/**
 * Created by Safsaf on 10/1/2016.
 */
public class Word {

    private  String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId= NO_IMAGE_PROVIDED;
    private  static  final  int NO_IMAGE_PROVIDED=-1;
    private int mAutioResourceId;

    public Word(String defaultTranslation ,String miwokTranslation,int autioResourceId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAutioResourceId=autioResourceId;
    }

    public Word(String defaultTranslation ,String miwokTranslation,int imageResourceId, int autioResourceId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=imageResourceId;
        mAutioResourceId=autioResourceId;
    }

    public String getmDefaultTranslation(){
        return  mDefaultTranslation;
    }

    public  String getmMiwokTranslation (){

        return mMiwokTranslation;
    }

    public  int getmImageResourceId(){
        return mImageResourceId;
    }

    public  boolean hasImage (){

        return  mImageResourceId !=NO_IMAGE_PROVIDED;

    }

    public  int getmAutioResourceId(){
        return mAutioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAutioResourceId=" + mAutioResourceId +
                '}';
    }



}
