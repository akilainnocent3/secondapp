package com.sporty.android.core.model.pocket.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BankAsset implements Parcelable {
    public static final Parcelable.Creator<BankAsset> CREATOR = new Parcelable.Creator<BankAsset>() { // from class: com.sporty.android.core.model.pocket.common.BankAsset.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BankAsset createFromParcel(Parcel parcel) {
            return new BankAsset(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BankAsset[] newArray(int i) {
            return new BankAsset[i];
        }
    };
    public List<EntityListBean> entityList;
    public int totalNum;

    public static class EntityListBean {
        public String bankCode;
        public String bankIconUrl;
        public int bankId;
        public String bankName;
        public Boolean easyBankAccount;
        public int isActive;
        public int rank;
        public Boolean ranked;
    }

    public BankAsset(Parcel parcel) {
        this.totalNum = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        this.entityList = arrayList;
        parcel.readList(arrayList, EntityListBean.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.totalNum);
        parcel.writeList(this.entityList);
    }

    public BankAsset() {
    }
}
