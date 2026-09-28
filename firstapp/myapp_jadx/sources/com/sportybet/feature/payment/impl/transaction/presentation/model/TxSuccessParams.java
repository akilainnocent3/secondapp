package com.sportybet.feature.payment.impl.transaction.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dd3;
import defpackage.f78;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.iib0;
import defpackage.log0;
import defpackage.m8h0;
import defpackage.mng;
import defpackage.mq0;
import defpackage.mtg0;
import defpackage.nyf;
import defpackage.oie;
import defpackage.uf80;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/payment/impl/transaction/presentation/model/TxSuccessParams;", "Landroid/os/Parcelable;", "Bank", "Momo", "Card", "Transfer", "Lcom/sportybet/feature/payment/impl/transaction/presentation/model/TxSuccessParams$Bank;", "Lcom/sportybet/feature/payment/impl/transaction/presentation/model/TxSuccessParams$Card;", "Lcom/sportybet/feature/payment/impl/transaction/presentation/model/TxSuccessParams$Momo;", "Lcom/sportybet/feature/payment/impl/transaction/presentation/model/TxSuccessParams$Transfer;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface TxSuccessParams extends Parcelable {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/payment/impl/transaction/presentation/model/TxSuccessParams$Bank;", "Landroid/os/Parcelable;", "Lcom/sportybet/feature/payment/impl/transaction/presentation/model/TxSuccessParams;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Bank implements Parcelable, TxSuccessParams {
        public static final Parcelable.Creator<Bank> CREATOR = new a();
        public final Integer A;
        public final boolean B;
        public final log0 a;
        public final m8h0 b;
        public final String c;
        public final String d;
        public final BigDecimal e;
        public final BigDecimal f;
        public final boolean i;
        public final String v;
        public final String w;
        public final String y;
        public final String z;

        public static final class a implements Parcelable.Creator<Bank> {
            @Override // android.os.Parcelable.Creator
            public final Bank createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                parcel.getClass();
                log0 log0VarValueOf = log0.valueOf(parcel.readString());
                m8h0 m8h0VarValueOf = m8h0.valueOf(parcel.readString());
                String string = parcel.readString();
                String string2 = parcel.readString();
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
                if (parcel.readInt() != 0) {
                    z2 = false;
                    z = true;
                } else {
                    z = false;
                    z2 = false;
                }
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z3 = z2;
                String string5 = parcel.readString();
                boolean z4 = true;
                String string6 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    z4 = z3;
                }
                return new Bank(log0VarValueOf, m8h0VarValueOf, string, string2, bigDecimal, bigDecimal2, z, string3, string4, string5, string6, numValueOf, z4);
            }

            @Override // android.os.Parcelable.Creator
            public final Bank[] newArray(int i) {
                return new Bank[i];
            }
        }

        public Bank(log0 log0Var, m8h0 m8h0Var, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, String str3, String str4, String str5, String str6, Integer num, boolean z2) {
            log0Var.getClass();
            m8h0Var.getClass();
            str2.getClass();
            bigDecimal.getClass();
            bigDecimal2.getClass();
            this.a = log0Var;
            this.b = m8h0Var;
            this.c = str;
            this.d = str2;
            this.e = bigDecimal;
            this.f = bigDecimal2;
            this.i = z;
            this.v = str3;
            this.w = str4;
            this.y = str5;
            this.z = str6;
            this.A = num;
            this.B = z2;
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: P, reason: from getter */
        public final log0 getA() {
            return this.a;
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: d, reason: from getter */
        public final BigDecimal getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: e0, reason: from getter */
        public final BigDecimal getF() {
            return this.f;
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: e1, reason: from getter */
        public final m8h0 getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bank)) {
                return false;
            }
            Bank bank = (Bank) obj;
            return this.a == bank.a && this.b == bank.b && Intrinsics.g(this.c, bank.c) && Intrinsics.g(this.d, bank.d) && Intrinsics.g(this.e, bank.e) && Intrinsics.g(this.f, bank.f) && this.i == bank.i && Intrinsics.g(this.v, bank.v) && Intrinsics.g(this.w, bank.w) && Intrinsics.g(this.y, bank.y) && Intrinsics.g(this.z, bank.z) && Intrinsics.g(this.A, bank.A) && this.B == bank.B;
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            String str = this.c;
            int iA = mtg0.a(dd3.a(this.f, dd3.a(this.e, gmf0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31), 31), 31, this.i);
            String str2 = this.v;
            int iHashCode2 = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.w;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.y;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.z;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.A;
            return Boolean.hashCode(this.B) + ((iHashCode5 + (num != null ? num.hashCode() : 0)) * 31);
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getC() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Bank(tradeType=");
            sb.append(this.a);
            sb.append(", txSuccessType=");
            sb.append(this.b);
            sb.append(", tradeId=");
            hxa.c(sb, this.c, ", currencySymbol=", this.d, ", amount=");
            iib0.b(sb, this.e, ", whtAmount=", this.f, ", showBvnGift=");
            mng.a(", bankName=", this.v, ", bankIconUrl=", sb, this.i);
            hxa.c(sb, this.w, ", bankPartialAccountNumber=", this.y, ", bankPartialAccountName=");
            oie.a(this.A, this.z, ", tradeStatus=", ", showAccountName=", sb);
            return mq0.a(sb, this.B, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a.name());
            parcel.writeString(this.b.name());
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeSerializable(this.e);
            parcel.writeSerializable(this.f);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeString(this.v);
            parcel.writeString(this.w);
            parcel.writeString(this.y);
            parcel.writeString(this.z);
            Integer num = this.A;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                f78.c(parcel, 1, num);
            }
            parcel.writeInt(this.B ? 1 : 0);
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: z0, reason: from getter */
        public final boolean getI() {
            return this.i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/payment/impl/transaction/presentation/model/TxSuccessParams$Card;", "Landroid/os/Parcelable;", "Lcom/sportybet/feature/payment/impl/transaction/presentation/model/TxSuccessParams;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Card implements Parcelable, TxSuccessParams {
        public static final Parcelable.Creator<Card> CREATOR = new a();
        public final log0 a;
        public final m8h0 b;
        public final String c;
        public final String d;
        public final BigDecimal e;
        public final BigDecimal f;
        public final boolean i;
        public final String v;
        public final String w;

        public static final class a implements Parcelable.Creator<Card> {
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Card(log0.valueOf(parcel.readString()), m8h0.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        public Card(log0 log0Var, m8h0 m8h0Var, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, String str3, String str4) {
            log0Var.getClass();
            m8h0Var.getClass();
            str2.getClass();
            bigDecimal.getClass();
            bigDecimal2.getClass();
            this.a = log0Var;
            this.b = m8h0Var;
            this.c = str;
            this.d = str2;
            this.e = bigDecimal;
            this.f = bigDecimal2;
            this.i = z;
            this.v = str3;
            this.w = str4;
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: P, reason: from getter */
        public final log0 getA() {
            return this.a;
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: d, reason: from getter */
        public final BigDecimal getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: e0, reason: from getter */
        public final BigDecimal getF() {
            return this.f;
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: e1, reason: from getter */
        public final m8h0 getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Card)) {
                return false;
            }
            Card card = (Card) obj;
            return this.a == card.a && this.b == card.b && Intrinsics.g(this.c, card.c) && Intrinsics.g(this.d, card.d) && Intrinsics.g(this.e, card.e) && Intrinsics.g(this.f, card.f) && this.i == card.i && Intrinsics.g(this.v, card.v) && Intrinsics.g(this.w, card.w);
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            String str = this.c;
            int iA = mtg0.a(dd3.a(this.f, dd3.a(this.e, gmf0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31), 31), 31, this.i);
            String str2 = this.v;
            int iHashCode2 = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.w;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getC() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Card(tradeType=");
            sb.append(this.a);
            sb.append(", txSuccessType=");
            sb.append(this.b);
            sb.append(", tradeId=");
            hxa.c(sb, this.c, ", currencySymbol=", this.d, ", amount=");
            iib0.b(sb, this.e, ", whtAmount=", this.f, ", showBvnGift=");
            mng.a(", counterAuthority=", this.v, ", cardNum=", sb, this.i);
            return uf80.a(sb, this.w, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a.name());
            parcel.writeString(this.b.name());
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeSerializable(this.e);
            parcel.writeSerializable(this.f);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeString(this.v);
            parcel.writeString(this.w);
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: z0, reason: from getter */
        public final boolean getI() {
            return this.i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/payment/impl/transaction/presentation/model/TxSuccessParams$Momo;", "Landroid/os/Parcelable;", "Lcom/sportybet/feature/payment/impl/transaction/presentation/model/TxSuccessParams;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Momo implements Parcelable, TxSuccessParams {
        public static final Parcelable.Creator<Momo> CREATOR = new a();
        public final log0 a;
        public final m8h0 b;
        public final String c;
        public final String d;
        public final BigDecimal e;
        public final BigDecimal f;
        public final boolean i;
        public final String v;
        public final String w;
        public final Integer y;
        public final String z;

        public static final class a implements Parcelable.Creator<Momo> {
            @Override // android.os.Parcelable.Creator
            public final Momo createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Momo(log0.valueOf(parcel.readString()), m8h0.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Momo[] newArray(int i) {
                return new Momo[i];
            }
        }

        public Momo(log0 log0Var, m8h0 m8h0Var, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, String str3, String str4, Integer num, String str5) {
            log0Var.getClass();
            m8h0Var.getClass();
            str2.getClass();
            bigDecimal.getClass();
            bigDecimal2.getClass();
            str3.getClass();
            str5.getClass();
            this.a = log0Var;
            this.b = m8h0Var;
            this.c = str;
            this.d = str2;
            this.e = bigDecimal;
            this.f = bigDecimal2;
            this.i = z;
            this.v = str3;
            this.w = str4;
            this.y = num;
            this.z = str5;
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: P, reason: from getter */
        public final log0 getA() {
            return this.a;
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: d, reason: from getter */
        public final BigDecimal getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: e0, reason: from getter */
        public final BigDecimal getF() {
            return this.f;
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: e1, reason: from getter */
        public final m8h0 getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Momo)) {
                return false;
            }
            Momo momo = (Momo) obj;
            return this.a == momo.a && this.b == momo.b && Intrinsics.g(this.c, momo.c) && Intrinsics.g(this.d, momo.d) && Intrinsics.g(this.e, momo.e) && Intrinsics.g(this.f, momo.f) && this.i == momo.i && Intrinsics.g(this.v, momo.v) && Intrinsics.g(this.w, momo.w) && Intrinsics.g(this.y, momo.y) && Intrinsics.g(this.z, momo.z);
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            String str = this.c;
            int iA = gmf0.a(mtg0.a(dd3.a(this.f, dd3.a(this.e, gmf0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31), 31), 31, this.i), 31, this.v);
            String str2 = this.w;
            int iHashCode2 = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.y;
            return this.z.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getC() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Momo(tradeType=");
            sb.append(this.a);
            sb.append(", txSuccessType=");
            sb.append(this.b);
            sb.append(", tradeId=");
            hxa.c(sb, this.c, ", currencySymbol=", this.d, ", amount=");
            iib0.b(sb, this.e, ", whtAmount=", this.f, ", showBvnGift=");
            mng.a(", channelDisplayName=", this.v, ", channelIconUrl=", sb, this.i);
            oie.a(this.y, this.w, ", channelIconResId=", ", mobileNumber=", sb);
            return uf80.a(sb, this.z, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a.name());
            parcel.writeString(this.b.name());
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeSerializable(this.e);
            parcel.writeSerializable(this.f);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeString(this.v);
            parcel.writeString(this.w);
            Integer num = this.y;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                f78.c(parcel, 1, num);
            }
            parcel.writeString(this.z);
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: z0, reason: from getter */
        public final boolean getI() {
            return this.i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/payment/impl/transaction/presentation/model/TxSuccessParams$Transfer;", "Landroid/os/Parcelable;", "Lcom/sportybet/feature/payment/impl/transaction/presentation/model/TxSuccessParams;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Transfer implements Parcelable, TxSuccessParams {
        public static final Parcelable.Creator<Transfer> CREATOR = new a();
        public final log0 a;
        public final m8h0 b;
        public final String c;
        public final String d;
        public final BigDecimal e;
        public final BigDecimal f;
        public final boolean i;
        public final String v;

        public static final class a implements Parcelable.Creator<Transfer> {
            @Override // android.os.Parcelable.Creator
            public final Transfer createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Transfer(log0.valueOf(parcel.readString()), m8h0.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Transfer[] newArray(int i) {
                return new Transfer[i];
            }
        }

        public Transfer(log0 log0Var, m8h0 m8h0Var, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, String str3) {
            log0Var.getClass();
            m8h0Var.getClass();
            str2.getClass();
            bigDecimal.getClass();
            bigDecimal2.getClass();
            str3.getClass();
            this.a = log0Var;
            this.b = m8h0Var;
            this.c = str;
            this.d = str2;
            this.e = bigDecimal;
            this.f = bigDecimal2;
            this.i = z;
            this.v = str3;
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: P, reason: from getter */
        public final log0 getA() {
            return this.a;
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: d, reason: from getter */
        public final BigDecimal getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: e0, reason: from getter */
        public final BigDecimal getF() {
            return this.f;
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: e1, reason: from getter */
        public final m8h0 getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Transfer)) {
                return false;
            }
            Transfer transfer = (Transfer) obj;
            return this.a == transfer.a && this.b == transfer.b && Intrinsics.g(this.c, transfer.c) && Intrinsics.g(this.d, transfer.d) && Intrinsics.g(this.e, transfer.e) && Intrinsics.g(this.f, transfer.f) && this.i == transfer.i && Intrinsics.g(this.v, transfer.v);
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            String str = this.c;
            return this.v.hashCode() + mtg0.a(dd3.a(this.f, dd3.a(this.e, gmf0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31), 31), 31, this.i);
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getC() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Transfer(tradeType=");
            sb.append(this.a);
            sb.append(", txSuccessType=");
            sb.append(this.b);
            sb.append(", tradeId=");
            hxa.c(sb, this.c, ", currencySymbol=", this.d, ", amount=");
            iib0.b(sb, this.e, ", whtAmount=", this.f, ", showBvnGift=");
            return nyf.a(", transferTo=", this.v, ")", sb, this.i);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a.name());
            parcel.writeString(this.b.name());
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeSerializable(this.e);
            parcel.writeSerializable(this.f);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeString(this.v);
        }

        @Override // com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams
        /* JADX INFO: renamed from: z0, reason: from getter */
        public final boolean getI() {
            return this.i;
        }
    }

    /* JADX INFO: renamed from: P */
    log0 getA();

    /* JADX INFO: renamed from: d */
    BigDecimal getE();

    /* JADX INFO: renamed from: e0 */
    BigDecimal getF();

    /* JADX INFO: renamed from: e1 */
    m8h0 getB();

    /* JADX INFO: renamed from: f */
    String getD();

    /* JADX INFO: renamed from: m */
    String getC();

    /* JADX INFO: renamed from: z0 */
    boolean getI();
}
