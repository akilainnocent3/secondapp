package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.pingpong.remote.models.CashoutException;
import com.sportygames.sportyherov2.components.SHToastContainer;
import com.twilio.voice.EventKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t6i implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t6i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0259  */
    /* JADX WARN: Code duplicated, block: B:133:0x0284 A[Catch: Exception -> 0x0305, TryCatch #0 {Exception -> 0x0305, blocks: (B:5:0x0015, B:7:0x001f, B:10:0x0027, B:13:0x004e, B:15:0x0052, B:16:0x006e, B:19:0x007a, B:21:0x0088, B:23:0x008e, B:24:0x0093, B:26:0x0099, B:28:0x00a1, B:29:0x00a6, B:31:0x00ac, B:32:0x00b1, B:34:0x00b7, B:36:0x00bf, B:37:0x00c4, B:39:0x00ca, B:41:0x00ce, B:118:0x021e, B:120:0x0226, B:121:0x022d, B:123:0x024a, B:125:0x0254, B:127:0x025a, B:129:0x0273, B:131:0x0279, B:134:0x0289, B:136:0x02b6, B:138:0x02bc, B:140:0x02c4, B:141:0x02c8, B:133:0x0284, B:42:0x00e4, B:44:0x00ea, B:46:0x00f8, B:48:0x00fe, B:49:0x0103, B:51:0x0109, B:53:0x0111, B:54:0x0116, B:56:0x011c, B:57:0x0121, B:59:0x0127, B:61:0x012f, B:62:0x0134, B:64:0x013a, B:66:0x013e, B:67:0x0152, B:68:0x0156, B:70:0x015a, B:71:0x0177, B:74:0x017f, B:76:0x0183, B:77:0x0188, B:79:0x018e, B:80:0x0193, B:82:0x0199, B:84:0x01a1, B:85:0x01a6, B:87:0x01ac, B:89:0x01b4, B:90:0x01b9, B:92:0x01bf, B:94:0x01c7, B:95:0x01cc, B:96:0x01cf, B:98:0x01d3, B:99:0x01d8, B:101:0x01de, B:102:0x01e3, B:104:0x01e9, B:106:0x01f1, B:107:0x01f6, B:109:0x01fc, B:111:0x0204, B:112:0x0209, B:114:0x020f, B:116:0x0217, B:117:0x021c, B:142:0x0302), top: B:149:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e4 A[Catch: Exception -> 0x0305, TryCatch #0 {Exception -> 0x0305, blocks: (B:5:0x0015, B:7:0x001f, B:10:0x0027, B:13:0x004e, B:15:0x0052, B:16:0x006e, B:19:0x007a, B:21:0x0088, B:23:0x008e, B:24:0x0093, B:26:0x0099, B:28:0x00a1, B:29:0x00a6, B:31:0x00ac, B:32:0x00b1, B:34:0x00b7, B:36:0x00bf, B:37:0x00c4, B:39:0x00ca, B:41:0x00ce, B:118:0x021e, B:120:0x0226, B:121:0x022d, B:123:0x024a, B:125:0x0254, B:127:0x025a, B:129:0x0273, B:131:0x0279, B:134:0x0289, B:136:0x02b6, B:138:0x02bc, B:140:0x02c4, B:141:0x02c8, B:133:0x0284, B:42:0x00e4, B:44:0x00ea, B:46:0x00f8, B:48:0x00fe, B:49:0x0103, B:51:0x0109, B:53:0x0111, B:54:0x0116, B:56:0x011c, B:57:0x0121, B:59:0x0127, B:61:0x012f, B:62:0x0134, B:64:0x013a, B:66:0x013e, B:67:0x0152, B:68:0x0156, B:70:0x015a, B:71:0x0177, B:74:0x017f, B:76:0x0183, B:77:0x0188, B:79:0x018e, B:80:0x0193, B:82:0x0199, B:84:0x01a1, B:85:0x01a6, B:87:0x01ac, B:89:0x01b4, B:90:0x01b9, B:92:0x01bf, B:94:0x01c7, B:95:0x01cc, B:96:0x01cf, B:98:0x01d3, B:99:0x01d8, B:101:0x01de, B:102:0x01e3, B:104:0x01e9, B:106:0x01f1, B:107:0x01f6, B:109:0x01fc, B:111:0x0204, B:112:0x0209, B:114:0x020f, B:116:0x0217, B:117:0x021c, B:142:0x0302), top: B:149:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea A[Catch: Exception -> 0x0305, TryCatch #0 {Exception -> 0x0305, blocks: (B:5:0x0015, B:7:0x001f, B:10:0x0027, B:13:0x004e, B:15:0x0052, B:16:0x006e, B:19:0x007a, B:21:0x0088, B:23:0x008e, B:24:0x0093, B:26:0x0099, B:28:0x00a1, B:29:0x00a6, B:31:0x00ac, B:32:0x00b1, B:34:0x00b7, B:36:0x00bf, B:37:0x00c4, B:39:0x00ca, B:41:0x00ce, B:118:0x021e, B:120:0x0226, B:121:0x022d, B:123:0x024a, B:125:0x0254, B:127:0x025a, B:129:0x0273, B:131:0x0279, B:134:0x0289, B:136:0x02b6, B:138:0x02bc, B:140:0x02c4, B:141:0x02c8, B:133:0x0284, B:42:0x00e4, B:44:0x00ea, B:46:0x00f8, B:48:0x00fe, B:49:0x0103, B:51:0x0109, B:53:0x0111, B:54:0x0116, B:56:0x011c, B:57:0x0121, B:59:0x0127, B:61:0x012f, B:62:0x0134, B:64:0x013a, B:66:0x013e, B:67:0x0152, B:68:0x0156, B:70:0x015a, B:71:0x0177, B:74:0x017f, B:76:0x0183, B:77:0x0188, B:79:0x018e, B:80:0x0193, B:82:0x0199, B:84:0x01a1, B:85:0x01a6, B:87:0x01ac, B:89:0x01b4, B:90:0x01b9, B:92:0x01bf, B:94:0x01c7, B:95:0x01cc, B:96:0x01cf, B:98:0x01d3, B:99:0x01d8, B:101:0x01de, B:102:0x01e3, B:104:0x01e9, B:106:0x01f1, B:107:0x01f6, B:109:0x01fc, B:111:0x0204, B:112:0x0209, B:114:0x020f, B:116:0x0217, B:117:0x021c, B:142:0x0302), top: B:149:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8 A[Catch: Exception -> 0x0305, TryCatch #0 {Exception -> 0x0305, blocks: (B:5:0x0015, B:7:0x001f, B:10:0x0027, B:13:0x004e, B:15:0x0052, B:16:0x006e, B:19:0x007a, B:21:0x0088, B:23:0x008e, B:24:0x0093, B:26:0x0099, B:28:0x00a1, B:29:0x00a6, B:31:0x00ac, B:32:0x00b1, B:34:0x00b7, B:36:0x00bf, B:37:0x00c4, B:39:0x00ca, B:41:0x00ce, B:118:0x021e, B:120:0x0226, B:121:0x022d, B:123:0x024a, B:125:0x0254, B:127:0x025a, B:129:0x0273, B:131:0x0279, B:134:0x0289, B:136:0x02b6, B:138:0x02bc, B:140:0x02c4, B:141:0x02c8, B:133:0x0284, B:42:0x00e4, B:44:0x00ea, B:46:0x00f8, B:48:0x00fe, B:49:0x0103, B:51:0x0109, B:53:0x0111, B:54:0x0116, B:56:0x011c, B:57:0x0121, B:59:0x0127, B:61:0x012f, B:62:0x0134, B:64:0x013a, B:66:0x013e, B:67:0x0152, B:68:0x0156, B:70:0x015a, B:71:0x0177, B:74:0x017f, B:76:0x0183, B:77:0x0188, B:79:0x018e, B:80:0x0193, B:82:0x0199, B:84:0x01a1, B:85:0x01a6, B:87:0x01ac, B:89:0x01b4, B:90:0x01b9, B:92:0x01bf, B:94:0x01c7, B:95:0x01cc, B:96:0x01cf, B:98:0x01d3, B:99:0x01d8, B:101:0x01de, B:102:0x01e3, B:104:0x01e9, B:106:0x01f1, B:107:0x01f6, B:109:0x01fc, B:111:0x0204, B:112:0x0209, B:114:0x020f, B:116:0x0217, B:117:0x021c, B:142:0x0302), top: B:149:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00fe A[Catch: Exception -> 0x0305, TryCatch #0 {Exception -> 0x0305, blocks: (B:5:0x0015, B:7:0x001f, B:10:0x0027, B:13:0x004e, B:15:0x0052, B:16:0x006e, B:19:0x007a, B:21:0x0088, B:23:0x008e, B:24:0x0093, B:26:0x0099, B:28:0x00a1, B:29:0x00a6, B:31:0x00ac, B:32:0x00b1, B:34:0x00b7, B:36:0x00bf, B:37:0x00c4, B:39:0x00ca, B:41:0x00ce, B:118:0x021e, B:120:0x0226, B:121:0x022d, B:123:0x024a, B:125:0x0254, B:127:0x025a, B:129:0x0273, B:131:0x0279, B:134:0x0289, B:136:0x02b6, B:138:0x02bc, B:140:0x02c4, B:141:0x02c8, B:133:0x0284, B:42:0x00e4, B:44:0x00ea, B:46:0x00f8, B:48:0x00fe, B:49:0x0103, B:51:0x0109, B:53:0x0111, B:54:0x0116, B:56:0x011c, B:57:0x0121, B:59:0x0127, B:61:0x012f, B:62:0x0134, B:64:0x013a, B:66:0x013e, B:67:0x0152, B:68:0x0156, B:70:0x015a, B:71:0x0177, B:74:0x017f, B:76:0x0183, B:77:0x0188, B:79:0x018e, B:80:0x0193, B:82:0x0199, B:84:0x01a1, B:85:0x01a6, B:87:0x01ac, B:89:0x01b4, B:90:0x01b9, B:92:0x01bf, B:94:0x01c7, B:95:0x01cc, B:96:0x01cf, B:98:0x01d3, B:99:0x01d8, B:101:0x01de, B:102:0x01e3, B:104:0x01e9, B:106:0x01f1, B:107:0x01f6, B:109:0x01fc, B:111:0x0204, B:112:0x0209, B:114:0x020f, B:116:0x0217, B:117:0x021c, B:142:0x0302), top: B:149:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x011c A[Catch: Exception -> 0x0305, TryCatch #0 {Exception -> 0x0305, blocks: (B:5:0x0015, B:7:0x001f, B:10:0x0027, B:13:0x004e, B:15:0x0052, B:16:0x006e, B:19:0x007a, B:21:0x0088, B:23:0x008e, B:24:0x0093, B:26:0x0099, B:28:0x00a1, B:29:0x00a6, B:31:0x00ac, B:32:0x00b1, B:34:0x00b7, B:36:0x00bf, B:37:0x00c4, B:39:0x00ca, B:41:0x00ce, B:118:0x021e, B:120:0x0226, B:121:0x022d, B:123:0x024a, B:125:0x0254, B:127:0x025a, B:129:0x0273, B:131:0x0279, B:134:0x0289, B:136:0x02b6, B:138:0x02bc, B:140:0x02c4, B:141:0x02c8, B:133:0x0284, B:42:0x00e4, B:44:0x00ea, B:46:0x00f8, B:48:0x00fe, B:49:0x0103, B:51:0x0109, B:53:0x0111, B:54:0x0116, B:56:0x011c, B:57:0x0121, B:59:0x0127, B:61:0x012f, B:62:0x0134, B:64:0x013a, B:66:0x013e, B:67:0x0152, B:68:0x0156, B:70:0x015a, B:71:0x0177, B:74:0x017f, B:76:0x0183, B:77:0x0188, B:79:0x018e, B:80:0x0193, B:82:0x0199, B:84:0x01a1, B:85:0x01a6, B:87:0x01ac, B:89:0x01b4, B:90:0x01b9, B:92:0x01bf, B:94:0x01c7, B:95:0x01cc, B:96:0x01cf, B:98:0x01d3, B:99:0x01d8, B:101:0x01de, B:102:0x01e3, B:104:0x01e9, B:106:0x01f1, B:107:0x01f6, B:109:0x01fc, B:111:0x0204, B:112:0x0209, B:114:0x020f, B:116:0x0217, B:117:0x021c, B:142:0x0302), top: B:149:0x0015 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50, types: [T] */
    /* JADX WARN: Type inference failed for: r4v99 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v12, types: [T] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        v720 binding;
        v720 binding2;
        v720 binding3;
        v720 binding4;
        v720 binding5;
        v720 binding6;
        ?? string;
        Context context;
        String strB;
        ixi ixiVar;
        ixi ixiVar2;
        ixi ixiVar3;
        ixi ixiVar4;
        ixi ixiVar5;
        Context context2;
        v720 binding7;
        v720 binding8;
        v720 binding9;
        v720 binding10;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                z7a0.c cVar = (z7a0.c) obj;
                cVar.getClass();
                ((Function1) obj2).invoke(new b6i.d(cVar.a, cVar.b, cVar.d, cVar.e, cVar.f, cVar.g, cVar.h));
                break;
            default:
                final m410 m410Var = (m410) obj2;
                try {
                    String strA = y54.a(Base64.decode((String) obj, 0));
                    if (strA != null && strA.length() != 0) {
                        Object objE = new eal().e(strA, CashoutException.class);
                        objE.getClass();
                        final CashoutException cashoutException = (CashoutException) objE;
                        final bq40 bq40Var = new bq40();
                        bq40Var.a = 1;
                        long betId = cashoutException.getBetId();
                        Object obj3 = m410Var.a;
                        int i2 = 2;
                        if (betId != 0) {
                            goa0 goa0Var = (goa0) obj3;
                            if (goa0Var != null) {
                                String strValueOf = String.valueOf(cashoutException.getRoundId());
                                long betId2 = cashoutException.getBetId();
                                strValueOf.getClass();
                                goa0Var.C.remove(goa0.E1(Long.valueOf(betId2), strValueOf));
                            }
                            ixi ixiVar6 = (ixi) m410Var.b;
                            if (ixiVar6 == null) {
                                ixiVar = (ixi) m410Var.b;
                                if (ixiVar != null) {
                                    if (cashoutException.getBetId() == ixiVar.c.getBetId()) {
                                        ixiVar2 = (ixi) m410Var.b;
                                        if (ixiVar2 != null) {
                                            ixiVar2.c.setBetPlacedV2(false);
                                        }
                                        ixiVar3 = (ixi) m410Var.b;
                                        if (ixiVar3 != null) {
                                            binding8.B.setAlpha(1.0f);
                                        }
                                        ixiVar4 = (ixi) m410Var.b;
                                        if (ixiVar4 != null) {
                                            ixiVar4.c.setCashoutInProgress(false);
                                        }
                                        ixiVar5 = (ixi) m410Var.b;
                                        if (ixiVar5 != null) {
                                            binding7.B.setClickable(true);
                                        }
                                        context2 = m410Var.getContext();
                                        if (context2 != null) {
                                            Intent intent = new Intent("custom-event-name");
                                            intent.putExtra("number", "2");
                                            intent.putExtra("enable button", true);
                                            fdt.a(context2).c(intent);
                                        }
                                        bq40Var.a = 2;
                                    }
                                }
                            } else if (cashoutException.getBetId() == ixiVar6.b.getBetId()) {
                                ixi ixiVar7 = (ixi) m410Var.b;
                                if (ixiVar7 != null) {
                                    ixiVar7.b.setBetPlacedV2(false);
                                }
                                ixi ixiVar8 = (ixi) m410Var.b;
                                if (ixiVar8 != null && (binding10 = ixiVar8.b.getBinding()) != null) {
                                    binding10.B.setAlpha(1.0f);
                                }
                                ixi ixiVar9 = (ixi) m410Var.b;
                                if (ixiVar9 != null) {
                                    ixiVar9.b.setCashoutInProgress(false);
                                }
                                ixi ixiVar10 = (ixi) m410Var.b;
                                if (ixiVar10 != null && (binding9 = ixiVar10.b.getBinding()) != null) {
                                    binding9.B.setClickable(true);
                                }
                                Context context3 = m410Var.getContext();
                                if (context3 != null && m410Var.h0) {
                                    Intent intent2 = new Intent("custom-event-name");
                                    intent2.putExtra("number", "1");
                                    intent2.putExtra("enable button", true);
                                    fdt.a(context3).c(intent2);
                                }
                            } else {
                                ixiVar = (ixi) m410Var.b;
                                if (ixiVar != null) {
                                    if (cashoutException.getBetId() == ixiVar.c.getBetId()) {
                                        ixiVar2 = (ixi) m410Var.b;
                                        if (ixiVar2 != null) {
                                            ixiVar2.c.setBetPlacedV2(false);
                                        }
                                        ixiVar3 = (ixi) m410Var.b;
                                        if (ixiVar3 != null && (binding8 = ixiVar3.c.getBinding()) != null) {
                                            binding8.B.setAlpha(1.0f);
                                        }
                                        ixiVar4 = (ixi) m410Var.b;
                                        if (ixiVar4 != null) {
                                            ixiVar4.c.setCashoutInProgress(false);
                                        }
                                        ixiVar5 = (ixi) m410Var.b;
                                        if (ixiVar5 != null && (binding7 = ixiVar5.c.getBinding()) != null) {
                                            binding7.B.setClickable(true);
                                        }
                                        context2 = m410Var.getContext();
                                        if (context2 != null && m410Var.h0) {
                                            Intent intent3 = new Intent("custom-event-name");
                                            intent3.putExtra("number", "2");
                                            intent3.putExtra("enable button", true);
                                            fdt.a(context2).c(intent3);
                                        }
                                        bq40Var.a = 2;
                                    }
                                }
                            }
                        } else {
                            goa0 goa0Var2 = (goa0) obj3;
                            if (goa0Var2 != null) {
                                String strValueOf2 = String.valueOf(cashoutException.getRoundId());
                                int betIndex = cashoutException.getBetIndex();
                                strValueOf2.getClass();
                                goa0Var2.B.remove(goa0.E1(Long.valueOf(betIndex), strValueOf2));
                            }
                            int betIndex2 = cashoutException.getBetIndex();
                            Object obj4 = m410Var.b;
                            if (betIndex2 == 1) {
                                ixi ixiVar11 = (ixi) obj4;
                                if (ixiVar11 != null) {
                                    ixiVar11.b.setBetInProgress(false);
                                }
                                ixi ixiVar12 = (ixi) m410Var.b;
                                if (ixiVar12 != null) {
                                    ixiVar12.b.setBetPlacedV2(false);
                                }
                                ixi ixiVar13 = (ixi) m410Var.b;
                                if (ixiVar13 != null && (binding6 = ixiVar13.b.getBinding()) != null) {
                                    binding6.v.setAlpha(1.0f);
                                }
                                ixi ixiVar14 = (ixi) m410Var.b;
                                if (ixiVar14 != null && (binding5 = ixiVar14.b.getBinding()) != null) {
                                    binding5.v.setClickable(true);
                                }
                                ixi ixiVar15 = (ixi) m410Var.b;
                                if (ixiVar15 != null && (binding4 = ixiVar15.b.getBinding()) != null) {
                                    binding4.d.setStatus(false);
                                }
                                m410Var.D = false;
                            } else {
                                ixi ixiVar16 = (ixi) obj4;
                                if (ixiVar16 != null) {
                                    ixiVar16.c.setBetInProgress(false);
                                }
                                ixi ixiVar17 = (ixi) m410Var.b;
                                if (ixiVar17 != null) {
                                    ixiVar17.c.setBetPlacedV2(false);
                                }
                                ixi ixiVar18 = (ixi) m410Var.b;
                                if (ixiVar18 != null && (binding3 = ixiVar18.c.getBinding()) != null) {
                                    binding3.v.setAlpha(1.0f);
                                }
                                ixi ixiVar19 = (ixi) m410Var.b;
                                if (ixiVar19 != null && (binding2 = ixiVar19.c.getBinding()) != null) {
                                    binding2.v.setClickable(true);
                                }
                                ixi ixiVar20 = (ixi) m410Var.b;
                                if (ixiVar20 != null && (binding = ixiVar20.c.getBinding()) != null) {
                                    binding.d.setStatus(false);
                                }
                                m410Var.H = false;
                            }
                        }
                        if (cashoutException.getBizCode() == 8015) {
                            m410Var.L0().x1();
                        }
                        final dq40 dq40Var = new dq40();
                        vs80 vs80Var = vs80.b;
                        vs80Var.getClass();
                        Integer num = vs80.c.get(Integer.valueOf(cashoutException.getBizCode()));
                        ?? r5 = 0;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            Context context4 = m410Var.getContext();
                            if (context4 != null) {
                                string = context4.getString(iIntValue);
                            } else {
                                string = 0;
                            }
                        } else {
                            string = 0;
                        }
                        dq40Var.a = string;
                        String str = (String) pcg.a(m410Var.getContext()).get(dq40Var.a);
                        final dq40 dq40Var2 = new dq40();
                        if (str == null) {
                            r5 = strB;
                            r5 = (String) dq40Var.a;
                        } else {
                            String str2 = (String) dq40Var.a;
                            if (str2 != null) {
                                op5.a.getClass();
                                strB = op5.b(str, str2, null);
                            }
                            if (r5 == 0) {
                                r5 = strB;
                                r5 = (String) dq40Var.a;
                            }
                        }
                        r5 = strB;
                        dq40Var2.a = r5;
                        ResultWrapper.GenericError genericError = new ResultWrapper.GenericError(0, new HTTPResponse(Integer.valueOf(cashoutException.getBizCode()), (String) dq40Var2.a, 0, null, Boolean.FALSE, null, null, 64, null));
                        final e activity = m410Var.getActivity();
                        if (activity != null && (context = m410Var.getContext()) != null) {
                            if (cashoutException.getBizCode() == 403) {
                                m410Var.k1();
                            } else {
                                fen fenVar = new fen(m410Var, i2);
                                txr txrVar = new txr(m410Var, 1);
                                l110 l110Var = new l110();
                                Function1 function1 = new Function1() { // from class: m110
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        ((String) obj5).getClass();
                                        m410 m410Var2 = m410Var;
                                        boolean z = m410Var2.h0;
                                        dq40 dq40Var3 = dq40Var2;
                                        if (z) {
                                            if (z) {
                                                Intent intent4 = new Intent("custom-event-name");
                                                intent4.putExtra(EventKeys.ERROR_MESSAGE, "");
                                                intent4.putExtra("cashoutErr", (String) dq40Var3.a);
                                                intent4.putExtra("betIndex", bq40Var.a);
                                                fdt.a(activity).c(intent4);
                                            }
                                            ixi ixiVar21 = (ixi) m410Var2.b;
                                            if (ixiVar21 != null) {
                                                ixiVar21.c.setDisableContainer();
                                            }
                                        } else {
                                            ixi ixiVar22 = (ixi) m410Var2.b;
                                            if (ixiVar22 != null) {
                                                ixiVar22.X.setVisibility(0);
                                            }
                                            String str3 = (String) dq40Var3.a;
                                            dq40 dq40Var4 = dq40Var;
                                            CashoutException cashoutException2 = cashoutException;
                                            if (str3 == null && ((String) dq40Var4.a) == null) {
                                                cashoutException2.getExMessage();
                                            }
                                            ixi ixiVar23 = (ixi) m410Var2.b;
                                            if (ixiVar23 != null) {
                                                SHToastContainer sHToastContainer = ixiVar23.X;
                                                String exMessage = (String) dq40Var3.a;
                                                if (exMessage == null && (exMessage = (String) dq40Var4.a) == null) {
                                                    exMessage = cashoutException2.getExMessage();
                                                }
                                                sHToastContainer.setMessageandBG(R.color.error_toast, exMessage);
                                            }
                                            nas nasVarA = ebs.a(m410Var2.getLifecycle());
                                            pfd pfdVar = fse.a;
                                            ej5.c(nasVarA, gku.a, null, new q410(m410Var2, null), 2);
                                        }
                                        return Unit.a;
                                    }
                                };
                                context.getColor(R.color.try_again_color);
                                vs80Var.c(activity, genericError, fenVar, txrVar, l110Var, 0, function1, new bai(m410Var, 1));
                            }
                        }
                    }
                    break;
                } catch (Exception unused) {
                }
                break;
        }
        return Unit.a;
    }
}
