package defpackage;

import androidx.media3.common.StreamKey;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class uam {
    public final String a;
    public final List<String> b;
    public final boolean c;

    public uam(String str, boolean z, List list) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }

    public abstract uam a(List<StreamKey> list);
}
