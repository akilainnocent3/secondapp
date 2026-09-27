package sg.bigo.ads.core.f.a.a.a;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements sg.bigo.ads.core.f.a.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Node f134796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<sg.bigo.ads.core.f.a.a.d> f134797b;

    public b(@NonNull Node node) {
        this.f134796a = node;
    }

    @Override // sg.bigo.ads.core.f.a.a.b
    public final List<sg.bigo.ads.core.f.a.a.d> a() {
        if (this.f134797b == null) {
            this.f134797b = new ArrayList();
            Iterator<Node> it = sg.bigo.ads.core.f.a.c(this.f134796a, "Companion").iterator();
            while (it.hasNext()) {
                this.f134797b.add(new d(it.next()));
            }
        }
        return this.f134797b;
    }
}
