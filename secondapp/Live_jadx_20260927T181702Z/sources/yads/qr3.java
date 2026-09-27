package yads;

import com.yandex.mobile.ads.instream.InstreamAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qr3 implements InstreamAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m00 f154572a;

    public qr3(m00 m00Var) {
        this.f154572a = m00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qr3) && kotlin.jvm.internal.m0.g(this.f154572a, ((qr3) obj).f154572a);
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAd
    public final List getAdBreaks() {
        List list = this.f154572a.f152237a;
        ArrayList arrayList = new ArrayList(fr.i0.d0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new rr3((o00) it.next()));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f154572a.hashCode();
    }

    public final String toString() {
        return "YandexInstreamAd(coreInstreamAd=" + this.f154572a + gi.j.f86771d;
    }
}
