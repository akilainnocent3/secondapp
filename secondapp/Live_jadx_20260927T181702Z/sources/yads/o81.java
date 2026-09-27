package yads;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class o81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m00 f153393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n81 f153394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l81 f153395c;

    public o81(m00 m00Var, n81 n81Var) {
        this.f153393a = m00Var;
        this.f153394b = n81Var;
    }

    public final l81 a() {
        Object obj;
        Object next;
        l81 l81Var = this.f153395c;
        if (l81Var != null) {
            return l81Var;
        }
        n81 n81Var = this.f153394b;
        List list = this.f153393a.f152237a;
        n81Var.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList<o00> arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (kotlin.jvm.internal.m0.g(((o00) obj2).f153283d, InstreamAdBreakType.MIDROLL)) {
                arrayList2.add(obj2);
            }
        }
        for (o00 o00Var : arrayList2) {
            q00 q00Var = o00Var.f153285f;
            long videoDuration = q00Var.f154214b;
            if (p00.f153669b == q00Var.f154213a) {
                videoDuration = (long) ((videoDuration / 100) * n81Var.f152929a.f151554a.getVideoDuration());
            }
            arrayList.add(new uf2(o00Var, videoDuration));
        }
        Collections.sort(arrayList, new m81());
        Iterator it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.m0.g(((o00) next).f153283d, InstreamAdBreakType.PREROLL));
        o00 o00Var2 = (o00) next;
        for (Object obj3 : list) {
            if (kotlin.jvm.internal.m0.g(((o00) obj3).f153283d, InstreamAdBreakType.POSTROLL)) {
                obj = obj3;
                break;
            }
        }
        l81 l81Var2 = new l81(arrayList, o00Var2, (o00) obj);
        this.f153395c = l81Var2;
        return l81Var2;
    }

    public /* synthetic */ o81(m00 m00Var, ki3 ki3Var) {
        this(m00Var, new n81(ki3Var));
    }
}
