package a3;

import androidx.datastore.preferences.protobuf.y1;
import java.io.IOException;
import java.io.InputStream;
import k.y0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final a f3599a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        @l
        public final f.b a(@l InputStream input) throws IOException {
            m0.p(input, "input");
            try {
                f.b bVarF6 = f.b.F6(input);
                m0.o(bVarF6, "{\n                Prefer…From(input)\n            }");
                return bVarF6;
            } catch (y1 e10) {
                throw new u2.g("Unable to parse preferences proto.", e10);
            }
        }

        public a() {
        }
    }
}
