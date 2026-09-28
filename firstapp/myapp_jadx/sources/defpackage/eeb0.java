package defpackage;

import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class eeb0 {
    public final z77 a = z77.d.a;
    public final deb0 b;

    public static abstract class a extends i3<String> {
        public final CharSequence c;
        public final z77 d;
        public int e;
        public int f;

        public a(eeb0 eeb0Var, CharSequence charSequence) {
            this.a = i3.a.b;
            this.e = 0;
            this.d = eeb0Var.a;
            this.f = Reader.READ_DONE;
            this.c = charSequence;
        }
    }

    public eeb0(deb0 deb0Var) {
        this.b = deb0Var;
    }

    public final List<String> a(CharSequence charSequence) {
        charSequence.getClass();
        ceb0 ceb0Var = new ceb0(this.b, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (ceb0Var.hasNext()) {
            arrayList.add(ceb0Var.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
