package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qe6 implements pe6 {
    public final List<vf6> a;

    public qe6(List<vf6> list) {
        if (list == null || list.isEmpty()) {
            hb5.a("Cannot set an empty CaptureStage list.");
            throw null;
        }
        this.a = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // defpackage.pe6
    public final List<vf6> a() {
        return this.a;
    }
}
