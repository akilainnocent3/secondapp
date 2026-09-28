package com.sportybet.plugin.realsports.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.MyLog;
import defpackage.itf0;
import defpackage.o8i;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class Outcome implements Comparable<Outcome>, Parcelable {
    public static final Parcelable.Creator<Outcome> CREATOR = new Parcelable.Creator<Outcome>() { // from class: com.sportybet.plugin.realsports.data.Outcome.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Outcome createFromParcel(Parcel parcel) {
            return new Outcome(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Outcome[] newArray(int i) {
            return new Outcome[i];
        }
    };
    public List<PreCannedBBOutcome> childOutcomes;
    public String desc;
    public int flag;
    public String id;
    public int isActive;
    public String odds;
    public boolean oddsBoostLfb;
    public int oddsChangesFlag;
    public String playerName;
    public String playerScore;
    public double probability;
    public int status;

    public Outcome(Parcel parcel) {
        this.childOutcomes = new ArrayList();
        this.id = parcel.readString();
        this.odds = parcel.readString();
        this.probability = parcel.readDouble();
        this.isActive = parcel.readInt();
        this.desc = parcel.readString();
        this.status = parcel.readInt();
        this.flag = parcel.readInt();
        this.oddsChangesFlag = parcel.readInt();
        this.playerScore = parcel.readString();
        this.playerName = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.childOutcomes = arrayList;
        parcel.readList(arrayList, Outcome.class.getClassLoader());
        this.oddsBoostLfb = parcel.readByte() != 0;
    }

    @Override // java.lang.Comparable
    public int compareTo(Outcome outcome) {
        return new BigDecimal(this.odds).subtract(new BigDecimal(outcome.odds)).signum();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.id, ((Outcome) obj).id);
    }

    public int hashCode() {
        String str = this.id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isJokerOutcome() {
        return this.id.equals(OutcomeEnum.Joker.getId());
    }

    public void onSelectionChanged(Outcome outcome) {
        this.odds = outcome.odds;
        this.isActive = outcome.isActive;
        this.probability = outcome.probability;
        this.flag = outcome.flag;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Outcome{id='");
        sb.append(this.id);
        sb.append("', odds='");
        sb.append(this.odds);
        sb.append("', probability=");
        sb.append(this.probability);
        sb.append(", desc='");
        sb.append(this.desc);
        sb.append("', playerName='");
        sb.append(this.playerName);
        sb.append("', childOutcomes=");
        return o8i.a(sb, this.childOutcomes, '}');
    }

    public boolean update(String str) {
        if (str == null) {
            return false;
        }
        try {
            String[] strArrSplit = str.split("#");
            this.id = strArrSplit[0];
            this.desc = strArrSplit[1];
            String str2 = this.odds;
            this.odds = strArrSplit[2];
            this.isActive = Integer.parseInt(strArrSplit[3]);
            if (strArrSplit.length > 6 && Double.parseDouble(strArrSplit[6]) > 1.0E-4d) {
                this.probability = Double.parseDouble(strArrSplit[6]);
            }
            if (this.isActive == 1 && this.odds.length() > 0 && str2 != null && str2.length() > 0) {
                if (Float.parseFloat(this.odds) > Float.parseFloat(str2)) {
                    this.flag = 1;
                    return true;
                }
                if (Float.parseFloat(this.odds) < Float.parseFloat(str2)) {
                    this.flag = 2;
                }
            }
            return true;
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.p(e, "Failed to update outcome", new Object[0]);
            return false;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.odds);
        parcel.writeDouble(this.probability);
        parcel.writeInt(this.isActive);
        parcel.writeString(this.desc);
        parcel.writeInt(this.status);
        parcel.writeInt(this.flag);
        parcel.writeInt(this.oddsChangesFlag);
        parcel.writeString(this.playerScore);
        parcel.writeString(this.playerName);
        parcel.writeList(this.childOutcomes);
        parcel.writeByte(this.oddsBoostLfb ? (byte) 1 : (byte) 0);
    }

    public Outcome() {
        this.childOutcomes = new ArrayList();
    }

    public Outcome(Outcome outcome) {
        this.childOutcomes = new ArrayList();
        this.id = outcome.id;
        this.odds = outcome.odds;
        this.isActive = outcome.isActive;
        this.desc = outcome.desc;
        this.status = outcome.status;
        this.flag = outcome.flag;
        this.oddsChangesFlag = outcome.oddsChangesFlag;
        this.probability = outcome.probability;
        this.playerName = outcome.playerName;
        this.playerScore = outcome.playerScore;
        this.childOutcomes = outcome.childOutcomes;
        this.oddsBoostLfb = outcome.oddsBoostLfb;
    }
}
