package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes5.dex */
public final class a3n {
    public static final List<z2n> a;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k3n.values().length];
            try {
                k3n k3nVar = k3n.a;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    static {
        c3n c3nVar = c3n.a;
        w3n w3nVar = w3n.a;
        k3n k3nVar = k3n.b;
        z2n z2nVar = new z2n("https://s.sporty.net/cms/green_attack_2pts_1_contrast_d5e33179f0.json", c3nVar, w3nVar, k3nVar);
        k3n k3nVar2 = k3n.a;
        z2n z2nVar2 = new z2n("https://s.sporty.net/cms/green_attack_2pts_1_fc8a3ebaae.json", c3nVar, w3nVar, k3nVar2);
        z2n z2nVar3 = new z2n("https://s.sporty.net/cms/green_attack_2pts_2_contrast_46696f3374.json", c3nVar, w3nVar, k3nVar);
        z2n z2nVar4 = new z2n("https://s.sporty.net/cms/green_attack_2pts_2_9a180f6c51.json", c3nVar, w3nVar, k3nVar2);
        w3n w3nVar2 = w3n.b;
        z2n z2nVar5 = new z2n("https://s.sporty.net/cms/green_attack_3pts_1_contrast_45db3a04ef.json", c3nVar, w3nVar2, k3nVar);
        z2n z2nVar6 = new z2n("https://s.sporty.net/cms/green_attack_3pts_1_5af109efb9.json", c3nVar, w3nVar2, k3nVar2);
        z2n z2nVar7 = new z2n("https://s.sporty.net/cms/green_attack_3pts_2_contrast_c6597fe9d0.json", c3nVar, w3nVar2, k3nVar);
        z2n z2nVar8 = new z2n("https://s.sporty.net/cms/green_attack_3pts_2_df5b960ed8.json", c3nVar, w3nVar2, k3nVar2);
        c3n c3nVar2 = c3n.b;
        a = b.k(z2nVar, z2nVar2, z2nVar3, z2nVar4, z2nVar5, z2nVar6, z2nVar7, z2nVar8, new z2n("https://s.sporty.net/cms/red_attack_2pts_1_contrast_70505cfb89.json", c3nVar2, w3nVar, k3nVar), new z2n("https://s.sporty.net/cms/red_attack_2pts_1_c98b08599d.json", c3nVar2, w3nVar, k3nVar2), new z2n("https://s.sporty.net/cms/red_attack_2pts_2_contrast_f78c784392.json", c3nVar2, w3nVar, k3nVar), new z2n("https://s.sporty.net/cms/red_attack_2pts_2_dfdf14f302.json", c3nVar2, w3nVar, k3nVar2), new z2n("https://s.sporty.net/cms/red_attack_3pts_1_contrast_5b510a30c8.json", c3nVar2, w3nVar2, k3nVar), new z2n("https://s.sporty.net/cms/red_attack_3pts_1_81eddea6f0.json", c3nVar2, w3nVar2, k3nVar2), new z2n("https://s.sporty.net/cms/red_attack_3pts_2_contrast_9df6ec9c91.json", c3nVar2, w3nVar2, k3nVar), new z2n("https://s.sporty.net/cms/red_attack_3pts_2_e435ad939f.json", c3nVar2, w3nVar2, k3nVar2));
    }

    public static ArrayList a(c3n c3nVar, k3n k3nVar, w3n w3nVar) {
        if (a.a[k3nVar.ordinal()] == 1) {
            k3nVar = k3n.b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            z2n z2nVar = (z2n) obj;
            if (c3nVar == null || z2nVar.b == c3nVar) {
                if (z2nVar.d == k3nVar && (w3nVar == null || z2nVar.c == w3nVar)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }
}
