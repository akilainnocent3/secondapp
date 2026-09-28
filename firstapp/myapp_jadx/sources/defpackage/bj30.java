package defpackage;

import com.appsflyer.internal.p;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lbj30;", "Lj8i0;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bj30 extends j8i0 {
    public final ssw<a> a;
    public final ssw b;

    public static abstract class a {

        /* JADX INFO: renamed from: bj30$a$a, reason: collision with other inner class name */
        public static final class C0128a extends a {
            public final List<RegularMarketRule> a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0128a(List<? extends RegularMarketRule> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0128a) && Intrinsics.g(this.a, ((C0128a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return p.a("Init(markets=", ")", this.a);
            }
        }

        public static final class b extends a {
            public final List<RegularMarketRule> a;

            /* JADX WARN: Multi-variable type inference failed */
            public b(List<? extends RegularMarketRule> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return p.a("Refresh(markets=", ")", this.a);
            }
        }
    }

    public bj30() {
        ssw<a> sswVar = new ssw<>();
        this.a = sswVar;
        this.b = sswVar;
    }
}
