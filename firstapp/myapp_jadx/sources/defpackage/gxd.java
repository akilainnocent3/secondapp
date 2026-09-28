package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class gxd {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxd) && g7f.b(8.0f, 8.0f) && g7f.b(16.0f, 16.0f) && g7f.b(20.0f, 20.0f) && g7f.b(12.0f, 12.0f) && g7f.b(56.0f, 56.0f) && g7f.b(32.0f, 32.0f) && g7f.b(16.0f, 16.0f) && g7f.b(32.0f, 32.0f) && g7f.b(120.0f, 120.0f);
    }

    public final int hashCode() {
        return Float.hashCode(120.0f) + tvh.a(32.0f, tvh.a(16.0f, tvh.a(32.0f, tvh.a(56.0f, tvh.a(12.0f, tvh.a(20.0f, tvh.a(16.0f, Float.hashCode(8.0f) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strC = g7f.c(8.0f);
        String strC2 = g7f.c(16.0f);
        String strC3 = g7f.c(20.0f);
        String strC4 = g7f.c(12.0f);
        String strC5 = g7f.c(56.0f);
        String strC6 = g7f.c(32.0f);
        String strC7 = g7f.c(16.0f);
        String strC8 = g7f.c(32.0f);
        String strC9 = g7f.c(120.0f);
        StringBuilder sbA = ux5.a("DepositDedicatedAccountDimens(cornerRadius=", strC, ", commonHorizontalPadding=", strC2, ", commonVerticalPadding=");
        hxa.c(sbA, strC3, ", itemPadding=", strC4, ", itemMinHeight=");
        hxa.c(sbA, strC5, ", itemPrimaryIconSize=", strC6, ", itemSecondaryIconSize=");
        hxa.c(sbA, strC7, ", commonIconSize=", strC8, ", mainImageSize=");
        return uf80.a(sbA, strC9, ")");
    }
}
