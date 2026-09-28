package com.sportybet.feature.luckynumber.featurematch.presentation;

import com.sportybet.feature.luckynumber.featurematch.domain.data.LNLastMinuteCard;
import defpackage.dd3;
import defpackage.hxa;
import defpackage.ipq;
import defpackage.qcn;
import defpackage.rkd0;
import defpackage.shu;
import defpackage.tx5;
import defpackage.uf80;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface b {

    public static final class a implements b {
        public final ipq a;

        public a(ipq ipqVar) {
            ipqVar.getClass();
            this.a = ipqVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "LaunchLuckyNumberLobby(tag=" + this.a + ")";
        }
    }

    /* JADX INFO: renamed from: com.sportybet.feature.luckynumber.featurematch.presentation.b$b, reason: collision with other inner class name */
    public static final class C0404b implements b {
        public final String a;
        public final String b;

        public C0404b(String str, String str2) {
            str.getClass();
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0404b)) {
                return false;
            }
            C0404b c0404b = (C0404b) obj;
            return Intrinsics.g(this.a, c0404b.a) && Intrinsics.g(this.b, c0404b.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return tx5.a("LaunchLuckyNumberPlaceBet(lotteryId=", this.a, ", marketGroupId=", this.b, ")");
        }
    }

    public static final class c implements b {
        public final LNLastMinuteCard a;
        public final qcn<Integer> b;
        public final BigDecimal c;
        public final BigDecimal d;
        public final BigDecimal e;

        public c(LNLastMinuteCard lNLastMinuteCard, qcn<Integer> qcnVar, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
            bigDecimal.getClass();
            bigDecimal2.getClass();
            this.a = lNLastMinuteCard;
            this.b = qcnVar;
            this.c = bigDecimal;
            this.d = bigDecimal2;
            this.e = bigDecimal3;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0044  */
        public final boolean equals(Object obj) {
            boolean zEquals;
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (this.a.equals(cVar.a) && this.b.equals(cVar.b)) {
                        BigDecimal bigDecimal = cVar.c;
                        rkd0.a aVar = rkd0.Companion;
                        if (Intrinsics.g(this.c, bigDecimal) && Intrinsics.g(this.d, cVar.d)) {
                            BigDecimal bigDecimal2 = cVar.e;
                            BigDecimal bigDecimal3 = this.e;
                            if (bigDecimal3 == null) {
                                if (bigDecimal2 == null) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (bigDecimal2 == null) {
                                zEquals = false;
                            } else {
                                zEquals = bigDecimal3.equals(bigDecimal2);
                            }
                            if (!zEquals) {
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int iA = shu.a(this.b, this.a.hashCode() * 31, 31);
            rkd0.a aVar = rkd0.Companion;
            int iA2 = dd3.a(this.d, dd3.a(this.c, iA, 31), 31);
            BigDecimal bigDecimal = this.e;
            return iA2 + (bigDecimal == null ? 0 : bigDecimal.hashCode());
        }

        public final String toString() {
            String plainString;
            String strA = rkd0.a(this.c);
            String strA2 = rkd0.a(this.d);
            BigDecimal bigDecimal = this.e;
            if (bigDecimal == null) {
                plainString = "null";
            } else {
                plainString = bigDecimal.toPlainString();
                plainString.getClass();
            }
            StringBuilder sb = new StringBuilder("PlaceBet(lastMinuteCard=");
            sb.append(this.a);
            sb.append(", balls=");
            sb.append(this.b);
            sb.append(", minStake=");
            hxa.c(sb, strA, ", maxStake=", strA2, ", maxPayout=");
            return uf80.a(sb, plainString, ")");
        }
    }
}
