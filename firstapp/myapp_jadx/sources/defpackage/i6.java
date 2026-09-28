package defpackage;

import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i6 extends h6 {
    public static i6 d;
    public BreakIterator c;

    @Override // defpackage.h6
    public final int[] a(int i) {
        int length = c().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                Intrinsics.n("impl");
                throw null;
            }
            boolean zIsBoundary = breakIterator.isBoundary(i);
            BreakIterator breakIterator2 = this.c;
            if (zIsBoundary) {
                if (breakIterator2 == null) {
                    Intrinsics.n("impl");
                    throw null;
                }
                int iFollowing = breakIterator2.following(i);
                if (iFollowing == -1) {
                    return null;
                }
                return b(i, iFollowing);
            }
            if (breakIterator2 == null) {
                Intrinsics.n("impl");
                throw null;
            }
            i = breakIterator2.following(i);
        } while (i != -1);
        return null;
    }

    @Override // defpackage.h6
    public final int[] d(int i) {
        int length = c().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        do {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                Intrinsics.n("impl");
                throw null;
            }
            boolean zIsBoundary = breakIterator.isBoundary(i);
            BreakIterator breakIterator2 = this.c;
            if (zIsBoundary) {
                if (breakIterator2 == null) {
                    Intrinsics.n("impl");
                    throw null;
                }
                int iPreceding = breakIterator2.preceding(i);
                if (iPreceding == -1) {
                    return null;
                }
                return b(iPreceding, i);
            }
            if (breakIterator2 == null) {
                Intrinsics.n("impl");
                throw null;
            }
            i = breakIterator2.preceding(i);
        } while (i != -1);
        return null;
    }
}
