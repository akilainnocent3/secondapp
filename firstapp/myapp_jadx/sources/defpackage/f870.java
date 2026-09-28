package defpackage;

import com.appsflyer.internal.l;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f870 implements df70 {
    public final String a;
    public final int b;
    public final String c;
    public final long d;
    public final a e;

    public interface a {

        /* JADX INFO: renamed from: f870$a$a, reason: collision with other inner class name */
        public static final class C0548a implements a {
            public final long a;

            public C0548a(long j) {
                this.a = j;
            }

            @Override // f870.a
            public final long a() {
                return this.a;
            }

            @Override // f870.a
            public final int b() {
                return R.string.page_instant_virtual__lottie_sporty_legends_goal;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0548a) && this.a == ((C0548a) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return d020.a(this.a, "Goal(elapsedSinceAttackResultStartMillis=", ")");
            }
        }

        public static final class b implements a {
            public final long a;

            public b(long j) {
                this.a = j;
            }

            @Override // f870.a
            public final long a() {
                return this.a;
            }

            @Override // f870.a
            public final int b() {
                return R.string.page_instant_virtual__lottie_sporty_legends_no_goal;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return d020.a(this.a, "NoGoal(elapsedSinceAttackResultStartMillis=", ")");
            }
        }

        long a();

        int b();
    }

    public f870(String str, int i, String str2, long j, a aVar) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = j;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f870)) {
            return false;
        }
        f870 f870Var = (f870) obj;
        return this.a.equals(f870Var.a) && this.b == f870Var.b && this.c.equals(f870Var.c) && this.d == f870Var.d && Intrinsics.g(this.e, f870Var.e);
    }

    public final int hashCode() {
        int iA = f87.a(gmf0.a(gpp.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), this.d, 31);
        a aVar = this.e;
        return iA + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "ScheduledFootballLottiePlaybackState(eventId=", this.a, ", currentSegmentId=", ", currentLottieUrl=");
        l.a(this.d, this.c, ", elapsedSinceStartMillis=", sbA);
        sbA.append(", attackResultType=");
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }
}
