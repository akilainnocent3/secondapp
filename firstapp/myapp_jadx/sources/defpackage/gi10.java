package defpackage;

import com.sportygames.sportyherov2.remote.models.PlaceRangeBetRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gi10 {

    public static abstract class a {

        /* JADX INFO: renamed from: gi10$a$a, reason: collision with other inner class name */
        public static final class C0596a extends a {
            public final PlaceRangeBetRequest a;

            public C0596a(PlaceRangeBetRequest placeRangeBetRequest) {
                this.a = placeRangeBetRequest;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0596a) && Intrinsics.g(this.a, ((C0596a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Send(request=" + this.a + ")";
            }
        }

        public static final class b extends a {
            public static final b a = new b();
        }
    }
}
