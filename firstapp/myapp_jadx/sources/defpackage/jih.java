package defpackage;

import com.sportygames.externalgames.model.GamesMetadataFilter;
import com.sportygames.externalgames.model.GamesMetadataSortBy;
import com.sportygames.externalgames.model.GamesMetadataSortOrder;

/* JADX INFO: loaded from: classes5.dex */
public final class jih {
    public final psm a;
    public final wsm b;

    public jih(psm psmVar, e4h e4hVar, wsm wsmVar) {
        psmVar.getClass();
        wsmVar.getClass();
        this.a = psmVar;
        this.b = wsmVar;
    }

    public static /* synthetic */ Object b(jih jihVar, GamesMetadataFilter gamesMetadataFilter, GamesMetadataSortBy gamesMetadataSortBy, GamesMetadataSortOrder gamesMetadataSortOrder, x1b x1bVar, int i) {
        if ((i & 1) != 0) {
            gamesMetadataFilter = null;
        }
        GamesMetadataFilter gamesMetadataFilter2 = gamesMetadataFilter;
        if ((i & 4) != 0) {
            gamesMetadataSortOrder = GamesMetadataSortOrder.DESC;
        }
        return jihVar.a(gamesMetadataFilter2, gamesMetadataSortBy, gamesMetadataSortOrder, (i & 8) != 0 ? 30 : 8, 0, x1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:39:0x0106  */
    /* JADX WARN: Code duplicated, block: B:41:0x010e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0114  */
    /* JADX WARN: Code duplicated, block: B:45:0x0117  */
    /* JADX WARN: Code duplicated, block: B:47:0x012b  */
    /* JADX WARN: Code duplicated, block: B:51:0x015b  */
    /* JADX WARN: Code duplicated, block: B:53:0x015f  */
    /* JADX WARN: Code duplicated, block: B:55:0x016b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0183  */
    /* JADX WARN: Code duplicated, block: B:60:0x018b  */
    /* JADX WARN: Code duplicated, block: B:62:0x019a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d2, code lost:
    
        if (r1 == r3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.sportygames.externalgames.model.GamesMetadataFilter r24, com.sportygames.externalgames.model.GamesMetadataSortBy r25, com.sportygames.externalgames.model.GamesMetadataSortOrder r26, int r27, int r28, defpackage.x1b r29) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jih.a(com.sportygames.externalgames.model.GamesMetadataFilter, com.sportygames.externalgames.model.GamesMetadataSortBy, com.sportygames.externalgames.model.GamesMetadataSortOrder, int, int, x1b):java.lang.Object");
    }
}
