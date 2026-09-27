package pt;

import fr.h0;
import java.util.List;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface y {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f121066a = new a();

        @Override // pt.y
        @oy.l
        public List<String> a(@oy.l String packageFqName) {
            m0.p(packageFqName, "packageFqName");
            return h0.J();
        }
    }

    @oy.l
    List<String> a(@oy.l String str);
}
