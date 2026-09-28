package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lpo4;", "", "", "a", "Ljava/lang/String;", "getCurrency", "()Ljava/lang/String;", "currency", "game-bonuscup_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class po4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("currency")
    private final String currency;

    public po4(String str) {
        str.getClass();
        this.currency = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof po4) && Intrinsics.g(this.currency, ((po4) obj).currency);
    }

    public final int hashCode() {
        return this.currency.hashCode();
    }

    public final String toString() {
        return j26.a(new StringBuilder("BonusCupRoundStartBody(currency="), this.currency, ')');
    }
}
