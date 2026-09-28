package defpackage;

import com.sportybet.android.instantwin.presentation.buildandgo.e;

/* JADX INFO: loaded from: classes5.dex */
public final class li5 implements e {
    public final fqk a;

    public li5(fqk fqkVar) {
        this.a = fqkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof li5) && this.a.equals(((li5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NavigateToGiftPickerPage(giftPickerInput=" + this.a + ")";
    }
}
