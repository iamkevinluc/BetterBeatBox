package com.example.betterbeatbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.widget.SeekBar;

import com.example.betterbeatbox.databinding.FragmentBeatBoxBinding;

public class BeatBoxSeekbarViewModel extends BaseObservable {

    private FragmentBeatBoxBinding binding;
    private int progressValue;

    BeatBox mBeatBox;

    public BeatBoxSeekbarViewModel(BeatBox beatBox) {
        this.mBeatBox = beatBox;
    }

    public void setBinding(FragmentBeatBoxBinding binding) {
        this.binding = binding;
        if(this.binding != null) {
            setProgressValue(this.binding.seekBar.getProgress());
            /*this.binding.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                    float newRate = i / 100.0f;

                    mBeatBox.setSoundPoolRate(newRate);

                    setProgressValue(i);
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                }
            });*/
        }
    }


    public void setProgressValue(int i) {
        this.progressValue = i;
        binding.executePendingBindings();
    }

    @Bindable
    public int getProgressValue() {
        return this.progressValue;
    }



    public BeatBox getBeatBox() {
        return this.mBeatBox;
    }

}