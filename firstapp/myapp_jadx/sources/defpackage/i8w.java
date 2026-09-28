package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class i8w implements ree0 {
    public final nsz a = new nsz();

    @Override // defpackage.ree0
    public final void a(byte[] bArr, int i, int i2, ree0.b bVar, oya<q4c> oyaVar) {
        j4c j4cVarA;
        nsz nszVar = this.a;
        nszVar.G(i2 + i, bArr);
        nszVar.I(i);
        ArrayList arrayList = new ArrayList();
        while (nszVar.a() > 0) {
            ly0.a("Incomplete Mp4Webvtt Top Level box header found.", nszVar.a() >= 8);
            int iJ = nszVar.j();
            if (nszVar.j() == 1987343459) {
                int i3 = iJ - 8;
                CharSequence charSequenceF = null;
                j4c.a aVarA = null;
                while (i3 > 0) {
                    ly0.a("Incomplete vtt cue box header found.", i3 >= 8);
                    int iJ2 = nszVar.j();
                    int iJ3 = nszVar.j();
                    int i4 = iJ2 - 8;
                    byte[] bArr2 = nszVar.a;
                    int i5 = nszVar.b;
                    String str = jrh0.a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    nszVar.J(i4);
                    i3 = (i3 - 8) - i4;
                    if (iJ3 == 1937011815) {
                        o0j0.d dVar = new o0j0.d();
                        o0j0.e(str2, dVar);
                        aVarA = dVar.a();
                    } else if (iJ3 == 1885436268) {
                        charSequenceF = o0j0.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (aVarA != null) {
                    aVarA.a = charSequenceF;
                    aVarA.b = null;
                    j4cVarA = aVarA.a();
                } else {
                    Pattern pattern = o0j0.a;
                    o0j0.d dVar2 = new o0j0.d();
                    dVar2.c = charSequenceF;
                    j4cVarA = dVar2.a().a();
                }
                arrayList.add(j4cVarA);
            } else {
                nszVar.J(iJ - 8);
            }
        }
        oyaVar.accept(new q4c(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}
