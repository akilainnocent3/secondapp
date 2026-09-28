package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes8.dex */
public final class vae0 implements Sequence<String> {
    public final /* synthetic */ CharSequence a;

    public vae0(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<String> iterator() {
        return new pfs(this.a);
    }
}
