package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
public final class xuh0 implements Sequence<wuh0> {
    public final ArrayList a = new ArrayList();

    public final void b(Object obj, String str) {
        this.a.add(new wuh0(obj, str));
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<wuh0> iterator() {
        return this.a.iterator();
    }
}
