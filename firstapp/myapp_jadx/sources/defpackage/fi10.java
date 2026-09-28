package defpackage;

import com.sportygames.sportyherov2.remote.models.PlaceOverUnderBetRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fi10 {

    public static abstract class a {

        /* JADX INFO: renamed from: fi10$a$a, reason: collision with other inner class name */
        public static final class C0565a extends a {
            public final PlaceOverUnderBetRequest a;

            public C0565a(PlaceOverUnderBetRequest placeOverUnderBetRequest) {
                this.a = placeOverUnderBetRequest;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0565a) && Intrinsics.g(this.a, ((C0565a) obj).a);
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
