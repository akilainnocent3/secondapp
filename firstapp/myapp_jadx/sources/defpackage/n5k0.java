package defpackage;

import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import java.text.Collator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n5k0 implements Function2 {
    public final /* synthetic */ Collator a;
    public final /* synthetic */ LinkedHashMap b;

    public /* synthetic */ n5k0(Collator collator, LinkedHashMap linkedHashMap) {
        this.a = collator;
        this.b = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        WorldCupTeam worldCupTeam = (WorldCupTeam) obj2;
        String id = ((WorldCupTeam) obj).getId();
        LinkedHashMap linkedHashMap = this.b;
        String str = (String) linkedHashMap.get(id);
        if (str == null) {
            str = "";
        }
        String str2 = (String) linkedHashMap.get(worldCupTeam.getId());
        return Integer.valueOf(this.a.compare(str, str2 != null ? str2 : ""));
    }
}
