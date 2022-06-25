package mthree_interview;

import java.time.LocalDateTime;

public class ModelingTrade {
    private int mId;
    private LocalDateTime mDate;
    private String mTicker;

    public ModelingTrade(int id, LocalDateTime date, String ticker) {
        this.mId = id;
        this.mDate = date;
        this.mTicker = ticker;
    }

    public static ModelingTrade modelingTrade(int id, LocalDateTime date, String ticker) {
        return new ModelingTrade(id, date, ticker);
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public LocalDateTime getmDate() {
        return mDate;
    }

    public void setmDate(LocalDateTime mDate) {
        this.mDate = mDate;
    }

    public String getmTicker() {
        return mTicker;
    }

    public void setmTicker(String mTicker) {
        this.mTicker = mTicker;
    }
}
