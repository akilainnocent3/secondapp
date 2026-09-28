package defpackage;

import android.net.Uri;
import com.sportybet.plugin.realsports.event.viewholder.PlayerThreeColumnViewHolder;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m5j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m5j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u6j u6jVar = (u6j) obj;
                ajh ajhVarL1 = u6jVar.l1();
                if (ajhVarL1 != null) {
                    ajhVarL1.e.clearAnimation();
                }
                ajh ajhVarL2 = u6jVar.l1();
                if (ajhVarL2 != null) {
                    ajhVarL2.e.setScaleX(1.0f);
                }
                ajh ajhVarL3 = u6jVar.l1();
                if (ajhVarL3 != null) {
                    ajhVarL3.e.setScaleY(1.0f);
                }
                return Unit.a;
            case 1:
                String str = ((pgx) obj).a;
                if (str != null) {
                    Uri uri = Uri.parse(str);
                    uri.getClass();
                    if (uri.getFragment() != null) {
                        ArrayList arrayList = new ArrayList();
                        Uri uri2 = Uri.parse(str);
                        uri2.getClass();
                        String fragment = uri2.getFragment();
                        StringBuilder sb = new StringBuilder();
                        fragment.getClass();
                        pgx.a(fragment, arrayList, sb);
                        return new Pair(arrayList, sb.toString());
                    }
                }
                return null;
            default:
                return Integer.valueOf(PlayerThreeColumnViewHolder.columnGapPx_delegate$lambda$0((PlayerThreeColumnViewHolder) obj));
        }
    }
}
