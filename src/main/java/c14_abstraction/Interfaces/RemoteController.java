package c14_abstraction.Interfaces;

public class RemoteController {
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public RemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }

    public void onUpChannelUpButton() {
        channelUpButton.onUp();
    }

    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }

    public void onUpVolumeUpButton() {
        volumeUpButton.onUp();
    }

    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }

    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }

    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }


}
