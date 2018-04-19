package com.example.betterbeatbox;

public class Sound {
    /*
    The path to the asset.
     */
    private String mAssetPath;
    /*
        The name of the asset.  Mostly the filename minus the extension.
     */
    private String mName;

    private Integer mSoundId;

    /**
     * parse the path into the path components and get the filename.
     *
     * @param assetPath
     */
    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(". wav", "");
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }

    public String getName() {
        return mName;
    }

    public String getAssetPath() {

        return mAssetPath;
    }

}
