package defpackage;

import com.sporty.android.core.model.loyalty.MissionBetCategory;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class msv {
    public static final MissionBetCategory a(String str) {
        MissionBetCategory next;
        if (str == null) {
            return null;
        }
        Iterator<MissionBetCategory> it = MissionBetCategory.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(next.name(), str));
        MissionBetCategory missionBetCategory = next;
        if (missionBetCategory != null) {
            return missionBetCategory;
        }
        itf0.a aVar = itf0.a;
        aVar.q("MissionBetCategory");
        aVar.n("Unknown betCategory '" + str + "'; treating as no category", new Object[0]);
        return null;
    }
}
