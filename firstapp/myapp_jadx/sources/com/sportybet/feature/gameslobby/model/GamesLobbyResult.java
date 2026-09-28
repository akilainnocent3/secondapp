package com.sportybet.feature.gameslobby.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.tug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011Ê\u0001\u0002\b\u0013¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult;", "Landroid/os/Parcelable;", "Exit", "Login", "AddMoney", "Transaction", "RefreshToken", "RedirectToGames", "BetPlaced", "WalletUpdated", "Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult$AddMoney;", "Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult$BetPlaced;", "Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult$Exit;", "Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult$Login;", "Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult$RedirectToGames;", "Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult$RefreshToken;", "Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult$Transaction;", "Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult$WalletUpdated;", "africa-bet-android", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface GamesLobbyResult extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult$AddMoney;", "Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class AddMoney implements GamesLobbyResult {
        public static final AddMoney a = new AddMoney();
        public static final Parcelable.Creator<AddMoney> CREATOR = new a();

        public static final class a implements Parcelable.Creator<AddMoney> {
            @Override // android.os.Parcelable.Creator
            public final AddMoney createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return AddMoney.a;
            }

            @Override // android.os.Parcelable.Creator
            public final AddMoney[] newArray(int i) {
                return new AddMoney[i];
            }
        }

        private AddMoney() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddMoney);
        }

        public final int hashCode() {
            return -655237180;
        }

        public final String toString() {
            return "AddMoney";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult$BetPlaced;", "Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class BetPlaced implements GamesLobbyResult {
        public static final Parcelable.Creator<BetPlaced> CREATOR = new a();
        public final Boolean a;
        public final String b;

        public static final class a implements Parcelable.Creator<BetPlaced> {
            @Override // android.os.Parcelable.Creator
            public final BetPlaced createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new BetPlaced(boolValueOf, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BetPlaced[] newArray(int i) {
                return new BetPlaced[i];
            }
        }

        public BetPlaced(Boolean bool, String str) {
            str.getClass();
            this.a = bool;
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BetPlaced)) {
                return false;
            }
            BetPlaced betPlaced = (BetPlaced) obj;
            return Intrinsics.g(this.a, betPlaced.a) && Intrinsics.g(this.b, betPlaced.b);
        }

        public final int hashCode() {
            Boolean bool = this.a;
            return this.b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31);
        }

        public final String toString() {
            return "BetPlaced(isRebet=" + this.a + ", gameName=" + this.b + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v3, types: [int] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            ?? BooleanValue;
            parcel.getClass();
            Boolean bool = this.a;
            if (bool == null) {
                BooleanValue = 0;
            } else {
                parcel.writeInt(1);
                BooleanValue = bool.booleanValue();
            }
            parcel.writeInt(BooleanValue);
            parcel.writeString(this.b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult$Exit;", "Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Exit implements GamesLobbyResult {
        public static final Exit a = new Exit();
        public static final Parcelable.Creator<Exit> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Exit> {
            @Override // android.os.Parcelable.Creator
            public final Exit createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Exit.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Exit[] newArray(int i) {
                return new Exit[i];
            }
        }

        private Exit() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -429916477;
        }

        public final String toString() {
            return "Exit";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult$Login;", "Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Login implements GamesLobbyResult {
        public static final Login a = new Login();
        public static final Parcelable.Creator<Login> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Login> {
            @Override // android.os.Parcelable.Creator
            public final Login createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Login.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Login[] newArray(int i) {
                return new Login[i];
            }
        }

        private Login() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Login);
        }

        public final int hashCode() {
            return -436314524;
        }

        public final String toString() {
            return "Login";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult$RedirectToGames;", "Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class RedirectToGames implements GamesLobbyResult {
        public static final RedirectToGames a = new RedirectToGames();
        public static final Parcelable.Creator<RedirectToGames> CREATOR = new a();

        public static final class a implements Parcelable.Creator<RedirectToGames> {
            @Override // android.os.Parcelable.Creator
            public final RedirectToGames createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return RedirectToGames.a;
            }

            @Override // android.os.Parcelable.Creator
            public final RedirectToGames[] newArray(int i) {
                return new RedirectToGames[i];
            }
        }

        private RedirectToGames() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RedirectToGames);
        }

        public final int hashCode() {
            return -629175611;
        }

        public final String toString() {
            return "RedirectToGames";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult$RefreshToken;", "Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class RefreshToken implements GamesLobbyResult {
        public static final RefreshToken a = new RefreshToken();
        public static final Parcelable.Creator<RefreshToken> CREATOR = new a();

        public static final class a implements Parcelable.Creator<RefreshToken> {
            @Override // android.os.Parcelable.Creator
            public final RefreshToken createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return RefreshToken.a;
            }

            @Override // android.os.Parcelable.Creator
            public final RefreshToken[] newArray(int i) {
                return new RefreshToken[i];
            }
        }

        private RefreshToken() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RefreshToken);
        }

        public final int hashCode() {
            return -1260873597;
        }

        public final String toString() {
            return "RefreshToken";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult$Transaction;", "Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Transaction implements GamesLobbyResult {
        public static final Parcelable.Creator<Transaction> CREATOR = new a();
        public final String a;

        public static final class a implements Parcelable.Creator<Transaction> {
            @Override // android.os.Parcelable.Creator
            public final Transaction createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Transaction(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Transaction[] newArray(int i) {
                return new Transaction[i];
            }
        }

        public Transaction(String str) {
            this.a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Transaction) && Intrinsics.g(this.a, ((Transaction) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("Transaction(searchKeyword=", this.a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult$WalletUpdated;", "Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class WalletUpdated implements GamesLobbyResult {
        public static final Parcelable.Creator<WalletUpdated> CREATOR = new a();
        public final double a;

        public static final class a implements Parcelable.Creator<WalletUpdated> {
            @Override // android.os.Parcelable.Creator
            public final WalletUpdated createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new WalletUpdated(parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final WalletUpdated[] newArray(int i) {
                return new WalletUpdated[i];
            }
        }

        public WalletUpdated(double d) {
            this.a = d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WalletUpdated) && Double.compare(this.a, ((WalletUpdated) obj).a) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.a);
        }

        public final String toString() {
            return "WalletUpdated(updatedBalance=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeDouble(this.a);
        }
    }
}
