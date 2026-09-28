package defpackage;

import android.graphics.Typeface;
import androidx.compose.runtime.a;
import com.sportygames.newcms.CMSRes;
import com.sportygames.newcms.b;
import com.sportygames.newcms.c;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class d9i {
    public static final Typeface a(CMSRes cMSRes, a aVar) {
        co5 next;
        Typeface typeface;
        cMSRes.getClass();
        aVar.N(930854166);
        Typeface typeface2 = Typeface.DEFAULT;
        typeface2.getClass();
        b bVar = (b) aVar.O(c.a);
        Iterator<co5> it = bVar.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof b9i));
        co5 co5Var = next;
        if (co5Var != null) {
            b9i b9iVar = co5Var instanceof b9i ? (b9i) co5Var : null;
            if (b9iVar != null) {
                String strE = c.e(bVar, cMSRes, new String[0]);
                if (strE != null && (typeface = b9iVar.a.get(strE)) != null) {
                    typeface2 = typeface;
                }
                aVar.H();
                return typeface2;
            }
        }
        aVar.H();
        return typeface2;
    }
}
