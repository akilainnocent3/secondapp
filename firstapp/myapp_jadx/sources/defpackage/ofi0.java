package defpackage;

import com.sporty.android.core.model.cms.CMSResponse;
import com.sporty.android.core.model.config.Version;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.instantwin.NetworkVirtualInHouseGamePromotionBanner;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes5.dex */
public final class ofi0 {
    public final lq1 a;
    public final wo5 b;
    public final mgb0 c;
    public final bnh0 d;
    public final arm e;

    public ofi0(lq1 lq1Var, wo5 wo5Var, mgb0 mgb0Var, bnh0 bnh0Var, arm armVar) {
        this.a = lq1Var;
        this.b = wo5Var;
        this.c = mgb0Var;
        this.d = bnh0Var;
        this.e = armVar;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0173 A[Catch: all -> 0x0242, TryCatch #0 {all -> 0x0242, blocks: (B:13:0x002b, B:117:0x01ae, B:118:0x01b4, B:120:0x01ba, B:124:0x01d1, B:126:0x01d5, B:133:0x01e2, B:134:0x01e6, B:136:0x01ec, B:140:0x0203, B:142:0x0207, B:146:0x0210, B:150:0x0219, B:154:0x0222, B:18:0x003b, B:25:0x005e, B:27:0x0066, B:29:0x006c, B:31:0x007e, B:33:0x0082, B:77:0x0106, B:90:0x0131, B:92:0x0137, B:94:0x0141, B:97:0x0148, B:99:0x0158, B:101:0x015e, B:104:0x0165, B:105:0x016c, B:106:0x016d, B:108:0x0173, B:113:0x017d, B:156:0x022a, B:157:0x0231, B:158:0x0232, B:159:0x0239, B:160:0x023a, B:161:0x0241, B:36:0x0088, B:38:0x008c, B:40:0x0094, B:42:0x00a0, B:44:0x00a4, B:47:0x00a9, B:49:0x00ad, B:50:0x00b3, B:52:0x00bf, B:54:0x00c3, B:57:0x00c8, B:59:0x00cc, B:60:0x00d2, B:62:0x00de, B:64:0x00e2, B:67:0x00e7, B:69:0x00eb, B:70:0x00f1, B:72:0x00fd, B:74:0x0101, B:78:0x0109, B:80:0x010d, B:81:0x0114, B:84:0x0122, B:86:0x012a, B:21:0x0042), top: B:165:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0179  */
    /* JADX WARN: Code duplicated, block: B:111:0x017a  */
    /* JADX WARN: Code duplicated, block: B:113:0x017d A[Catch: all -> 0x0242, TryCatch #0 {all -> 0x0242, blocks: (B:13:0x002b, B:117:0x01ae, B:118:0x01b4, B:120:0x01ba, B:124:0x01d1, B:126:0x01d5, B:133:0x01e2, B:134:0x01e6, B:136:0x01ec, B:140:0x0203, B:142:0x0207, B:146:0x0210, B:150:0x0219, B:154:0x0222, B:18:0x003b, B:25:0x005e, B:27:0x0066, B:29:0x006c, B:31:0x007e, B:33:0x0082, B:77:0x0106, B:90:0x0131, B:92:0x0137, B:94:0x0141, B:97:0x0148, B:99:0x0158, B:101:0x015e, B:104:0x0165, B:105:0x016c, B:106:0x016d, B:108:0x0173, B:113:0x017d, B:156:0x022a, B:157:0x0231, B:158:0x0232, B:159:0x0239, B:160:0x023a, B:161:0x0241, B:36:0x0088, B:38:0x008c, B:40:0x0094, B:42:0x00a0, B:44:0x00a4, B:47:0x00a9, B:49:0x00ad, B:50:0x00b3, B:52:0x00bf, B:54:0x00c3, B:57:0x00c8, B:59:0x00cc, B:60:0x00d2, B:62:0x00de, B:64:0x00e2, B:67:0x00e7, B:69:0x00eb, B:70:0x00f1, B:72:0x00fd, B:74:0x0101, B:78:0x0109, B:80:0x010d, B:81:0x0114, B:84:0x0122, B:86:0x012a, B:21:0x0042), top: B:165:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ba A[Catch: all -> 0x0242, TryCatch #0 {all -> 0x0242, blocks: (B:13:0x002b, B:117:0x01ae, B:118:0x01b4, B:120:0x01ba, B:124:0x01d1, B:126:0x01d5, B:133:0x01e2, B:134:0x01e6, B:136:0x01ec, B:140:0x0203, B:142:0x0207, B:146:0x0210, B:150:0x0219, B:154:0x0222, B:18:0x003b, B:25:0x005e, B:27:0x0066, B:29:0x006c, B:31:0x007e, B:33:0x0082, B:77:0x0106, B:90:0x0131, B:92:0x0137, B:94:0x0141, B:97:0x0148, B:99:0x0158, B:101:0x015e, B:104:0x0165, B:105:0x016c, B:106:0x016d, B:108:0x0173, B:113:0x017d, B:156:0x022a, B:157:0x0231, B:158:0x0232, B:159:0x0239, B:160:0x023a, B:161:0x0241, B:36:0x0088, B:38:0x008c, B:40:0x0094, B:42:0x00a0, B:44:0x00a4, B:47:0x00a9, B:49:0x00ad, B:50:0x00b3, B:52:0x00bf, B:54:0x00c3, B:57:0x00c8, B:59:0x00cc, B:60:0x00d2, B:62:0x00de, B:64:0x00e2, B:67:0x00e7, B:69:0x00eb, B:70:0x00f1, B:72:0x00fd, B:74:0x0101, B:78:0x0109, B:80:0x010d, B:81:0x0114, B:84:0x0122, B:86:0x012a, B:21:0x0042), top: B:165:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x01d5 A[Catch: all -> 0x0242, TRY_LEAVE, TryCatch #0 {all -> 0x0242, blocks: (B:13:0x002b, B:117:0x01ae, B:118:0x01b4, B:120:0x01ba, B:124:0x01d1, B:126:0x01d5, B:133:0x01e2, B:134:0x01e6, B:136:0x01ec, B:140:0x0203, B:142:0x0207, B:146:0x0210, B:150:0x0219, B:154:0x0222, B:18:0x003b, B:25:0x005e, B:27:0x0066, B:29:0x006c, B:31:0x007e, B:33:0x0082, B:77:0x0106, B:90:0x0131, B:92:0x0137, B:94:0x0141, B:97:0x0148, B:99:0x0158, B:101:0x015e, B:104:0x0165, B:105:0x016c, B:106:0x016d, B:108:0x0173, B:113:0x017d, B:156:0x022a, B:157:0x0231, B:158:0x0232, B:159:0x0239, B:160:0x023a, B:161:0x0241, B:36:0x0088, B:38:0x008c, B:40:0x0094, B:42:0x00a0, B:44:0x00a4, B:47:0x00a9, B:49:0x00ad, B:50:0x00b3, B:52:0x00bf, B:54:0x00c3, B:57:0x00c8, B:59:0x00cc, B:60:0x00d2, B:62:0x00de, B:64:0x00e2, B:67:0x00e7, B:69:0x00eb, B:70:0x00f1, B:72:0x00fd, B:74:0x0101, B:78:0x0109, B:80:0x010d, B:81:0x0114, B:84:0x0122, B:86:0x012a, B:21:0x0042), top: B:165:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x01da  */
    /* JADX WARN: Code duplicated, block: B:131:0x01df  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ec A[Catch: all -> 0x0242, TryCatch #0 {all -> 0x0242, blocks: (B:13:0x002b, B:117:0x01ae, B:118:0x01b4, B:120:0x01ba, B:124:0x01d1, B:126:0x01d5, B:133:0x01e2, B:134:0x01e6, B:136:0x01ec, B:140:0x0203, B:142:0x0207, B:146:0x0210, B:150:0x0219, B:154:0x0222, B:18:0x003b, B:25:0x005e, B:27:0x0066, B:29:0x006c, B:31:0x007e, B:33:0x0082, B:77:0x0106, B:90:0x0131, B:92:0x0137, B:94:0x0141, B:97:0x0148, B:99:0x0158, B:101:0x015e, B:104:0x0165, B:105:0x016c, B:106:0x016d, B:108:0x0173, B:113:0x017d, B:156:0x022a, B:157:0x0231, B:158:0x0232, B:159:0x0239, B:160:0x023a, B:161:0x0241, B:36:0x0088, B:38:0x008c, B:40:0x0094, B:42:0x00a0, B:44:0x00a4, B:47:0x00a9, B:49:0x00ad, B:50:0x00b3, B:52:0x00bf, B:54:0x00c3, B:57:0x00c8, B:59:0x00cc, B:60:0x00d2, B:62:0x00de, B:64:0x00e2, B:67:0x00e7, B:69:0x00eb, B:70:0x00f1, B:72:0x00fd, B:74:0x0101, B:78:0x0109, B:80:0x010d, B:81:0x0114, B:84:0x0122, B:86:0x012a, B:21:0x0042), top: B:165:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0207 A[Catch: all -> 0x0242, TryCatch #0 {all -> 0x0242, blocks: (B:13:0x002b, B:117:0x01ae, B:118:0x01b4, B:120:0x01ba, B:124:0x01d1, B:126:0x01d5, B:133:0x01e2, B:134:0x01e6, B:136:0x01ec, B:140:0x0203, B:142:0x0207, B:146:0x0210, B:150:0x0219, B:154:0x0222, B:18:0x003b, B:25:0x005e, B:27:0x0066, B:29:0x006c, B:31:0x007e, B:33:0x0082, B:77:0x0106, B:90:0x0131, B:92:0x0137, B:94:0x0141, B:97:0x0148, B:99:0x0158, B:101:0x015e, B:104:0x0165, B:105:0x016c, B:106:0x016d, B:108:0x0173, B:113:0x017d, B:156:0x022a, B:157:0x0231, B:158:0x0232, B:159:0x0239, B:160:0x023a, B:161:0x0241, B:36:0x0088, B:38:0x008c, B:40:0x0094, B:42:0x00a0, B:44:0x00a4, B:47:0x00a9, B:49:0x00ad, B:50:0x00b3, B:52:0x00bf, B:54:0x00c3, B:57:0x00c8, B:59:0x00cc, B:60:0x00d2, B:62:0x00de, B:64:0x00e2, B:67:0x00e7, B:69:0x00eb, B:70:0x00f1, B:72:0x00fd, B:74:0x0101, B:78:0x0109, B:80:0x010d, B:81:0x0114, B:84:0x0122, B:86:0x012a, B:21:0x0042), top: B:165:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x020d  */
    /* JADX WARN: Code duplicated, block: B:145:0x020f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0216  */
    /* JADX WARN: Code duplicated, block: B:149:0x0218  */
    /* JADX WARN: Code duplicated, block: B:152:0x021f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0221  */
    /* JADX WARN: Code duplicated, block: B:158:0x0232 A[Catch: all -> 0x0242, TryCatch #0 {all -> 0x0242, blocks: (B:13:0x002b, B:117:0x01ae, B:118:0x01b4, B:120:0x01ba, B:124:0x01d1, B:126:0x01d5, B:133:0x01e2, B:134:0x01e6, B:136:0x01ec, B:140:0x0203, B:142:0x0207, B:146:0x0210, B:150:0x0219, B:154:0x0222, B:18:0x003b, B:25:0x005e, B:27:0x0066, B:29:0x006c, B:31:0x007e, B:33:0x0082, B:77:0x0106, B:90:0x0131, B:92:0x0137, B:94:0x0141, B:97:0x0148, B:99:0x0158, B:101:0x015e, B:104:0x0165, B:105:0x016c, B:106:0x016d, B:108:0x0173, B:113:0x017d, B:156:0x022a, B:157:0x0231, B:158:0x0232, B:159:0x0239, B:160:0x023a, B:161:0x0241, B:36:0x0088, B:38:0x008c, B:40:0x0094, B:42:0x00a0, B:44:0x00a4, B:47:0x00a9, B:49:0x00ad, B:50:0x00b3, B:52:0x00bf, B:54:0x00c3, B:57:0x00c8, B:59:0x00cc, B:60:0x00d2, B:62:0x00de, B:64:0x00e2, B:67:0x00e7, B:69:0x00eb, B:70:0x00f1, B:72:0x00fd, B:74:0x0101, B:78:0x0109, B:80:0x010d, B:81:0x0114, B:84:0x0122, B:86:0x012a, B:21:0x0042), top: B:165:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x023a A[Catch: all -> 0x0242, TryCatch #0 {all -> 0x0242, blocks: (B:13:0x002b, B:117:0x01ae, B:118:0x01b4, B:120:0x01ba, B:124:0x01d1, B:126:0x01d5, B:133:0x01e2, B:134:0x01e6, B:136:0x01ec, B:140:0x0203, B:142:0x0207, B:146:0x0210, B:150:0x0219, B:154:0x0222, B:18:0x003b, B:25:0x005e, B:27:0x0066, B:29:0x006c, B:31:0x007e, B:33:0x0082, B:77:0x0106, B:90:0x0131, B:92:0x0137, B:94:0x0141, B:97:0x0148, B:99:0x0158, B:101:0x015e, B:104:0x0165, B:105:0x016c, B:106:0x016d, B:108:0x0173, B:113:0x017d, B:156:0x022a, B:157:0x0231, B:158:0x0232, B:159:0x0239, B:160:0x023a, B:161:0x0241, B:36:0x0088, B:38:0x008c, B:40:0x0094, B:42:0x00a0, B:44:0x00a4, B:47:0x00a9, B:49:0x00ad, B:50:0x00b3, B:52:0x00bf, B:54:0x00c3, B:57:0x00c8, B:59:0x00cc, B:60:0x00d2, B:62:0x00de, B:64:0x00e2, B:67:0x00e7, B:69:0x00eb, B:70:0x00f1, B:72:0x00fd, B:74:0x0101, B:78:0x0109, B:80:0x010d, B:81:0x0114, B:84:0x0122, B:86:0x012a, B:21:0x0042), top: B:165:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:90:0x0131 A[Catch: all -> 0x0242, TryCatch #0 {all -> 0x0242, blocks: (B:13:0x002b, B:117:0x01ae, B:118:0x01b4, B:120:0x01ba, B:124:0x01d1, B:126:0x01d5, B:133:0x01e2, B:134:0x01e6, B:136:0x01ec, B:140:0x0203, B:142:0x0207, B:146:0x0210, B:150:0x0219, B:154:0x0222, B:18:0x003b, B:25:0x005e, B:27:0x0066, B:29:0x006c, B:31:0x007e, B:33:0x0082, B:77:0x0106, B:90:0x0131, B:92:0x0137, B:94:0x0141, B:97:0x0148, B:99:0x0158, B:101:0x015e, B:104:0x0165, B:105:0x016c, B:106:0x016d, B:108:0x0173, B:113:0x017d, B:156:0x022a, B:157:0x0231, B:158:0x0232, B:159:0x0239, B:160:0x023a, B:161:0x0241, B:36:0x0088, B:38:0x008c, B:40:0x0094, B:42:0x00a0, B:44:0x00a4, B:47:0x00a9, B:49:0x00ad, B:50:0x00b3, B:52:0x00bf, B:54:0x00c3, B:57:0x00c8, B:59:0x00cc, B:60:0x00d2, B:62:0x00de, B:64:0x00e2, B:67:0x00e7, B:69:0x00eb, B:70:0x00f1, B:72:0x00fd, B:74:0x0101, B:78:0x0109, B:80:0x010d, B:81:0x0114, B:84:0x0122, B:86:0x012a, B:21:0x0042), top: B:165:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0137 A[Catch: all -> 0x0242, TryCatch #0 {all -> 0x0242, blocks: (B:13:0x002b, B:117:0x01ae, B:118:0x01b4, B:120:0x01ba, B:124:0x01d1, B:126:0x01d5, B:133:0x01e2, B:134:0x01e6, B:136:0x01ec, B:140:0x0203, B:142:0x0207, B:146:0x0210, B:150:0x0219, B:154:0x0222, B:18:0x003b, B:25:0x005e, B:27:0x0066, B:29:0x006c, B:31:0x007e, B:33:0x0082, B:77:0x0106, B:90:0x0131, B:92:0x0137, B:94:0x0141, B:97:0x0148, B:99:0x0158, B:101:0x015e, B:104:0x0165, B:105:0x016c, B:106:0x016d, B:108:0x0173, B:113:0x017d, B:156:0x022a, B:157:0x0231, B:158:0x0232, B:159:0x0239, B:160:0x023a, B:161:0x0241, B:36:0x0088, B:38:0x008c, B:40:0x0094, B:42:0x00a0, B:44:0x00a4, B:47:0x00a9, B:49:0x00ad, B:50:0x00b3, B:52:0x00bf, B:54:0x00c3, B:57:0x00c8, B:59:0x00cc, B:60:0x00d2, B:62:0x00de, B:64:0x00e2, B:67:0x00e7, B:69:0x00eb, B:70:0x00f1, B:72:0x00fd, B:74:0x0101, B:78:0x0109, B:80:0x010d, B:81:0x0114, B:84:0x0122, B:86:0x012a, B:21:0x0042), top: B:165:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0141 A[Catch: all -> 0x0242, TryCatch #0 {all -> 0x0242, blocks: (B:13:0x002b, B:117:0x01ae, B:118:0x01b4, B:120:0x01ba, B:124:0x01d1, B:126:0x01d5, B:133:0x01e2, B:134:0x01e6, B:136:0x01ec, B:140:0x0203, B:142:0x0207, B:146:0x0210, B:150:0x0219, B:154:0x0222, B:18:0x003b, B:25:0x005e, B:27:0x0066, B:29:0x006c, B:31:0x007e, B:33:0x0082, B:77:0x0106, B:90:0x0131, B:92:0x0137, B:94:0x0141, B:97:0x0148, B:99:0x0158, B:101:0x015e, B:104:0x0165, B:105:0x016c, B:106:0x016d, B:108:0x0173, B:113:0x017d, B:156:0x022a, B:157:0x0231, B:158:0x0232, B:159:0x0239, B:160:0x023a, B:161:0x0241, B:36:0x0088, B:38:0x008c, B:40:0x0094, B:42:0x00a0, B:44:0x00a4, B:47:0x00a9, B:49:0x00ad, B:50:0x00b3, B:52:0x00bf, B:54:0x00c3, B:57:0x00c8, B:59:0x00cc, B:60:0x00d2, B:62:0x00de, B:64:0x00e2, B:67:0x00e7, B:69:0x00eb, B:70:0x00f1, B:72:0x00fd, B:74:0x0101, B:78:0x0109, B:80:0x010d, B:81:0x0114, B:84:0x0122, B:86:0x012a, B:21:0x0042), top: B:165:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0158 A[Catch: all -> 0x0242, TryCatch #0 {all -> 0x0242, blocks: (B:13:0x002b, B:117:0x01ae, B:118:0x01b4, B:120:0x01ba, B:124:0x01d1, B:126:0x01d5, B:133:0x01e2, B:134:0x01e6, B:136:0x01ec, B:140:0x0203, B:142:0x0207, B:146:0x0210, B:150:0x0219, B:154:0x0222, B:18:0x003b, B:25:0x005e, B:27:0x0066, B:29:0x006c, B:31:0x007e, B:33:0x0082, B:77:0x0106, B:90:0x0131, B:92:0x0137, B:94:0x0141, B:97:0x0148, B:99:0x0158, B:101:0x015e, B:104:0x0165, B:105:0x016c, B:106:0x016d, B:108:0x0173, B:113:0x017d, B:156:0x022a, B:157:0x0231, B:158:0x0232, B:159:0x0239, B:160:0x023a, B:161:0x0241, B:36:0x0088, B:38:0x008c, B:40:0x0094, B:42:0x00a0, B:44:0x00a4, B:47:0x00a9, B:49:0x00ad, B:50:0x00b3, B:52:0x00bf, B:54:0x00c3, B:57:0x00c8, B:59:0x00cc, B:60:0x00d2, B:62:0x00de, B:64:0x00e2, B:67:0x00e7, B:69:0x00eb, B:70:0x00f1, B:72:0x00fd, B:74:0x0101, B:78:0x0109, B:80:0x010d, B:81:0x0114, B:84:0x0122, B:86:0x012a, B:21:0x0042), top: B:165:0x0021 }] */
    public final Object a(x1b x1bVar) {
        mfi0 mfi0Var;
        ofi0 ofi0Var;
        BOConfigParam bOConfigParam;
        NetworkVirtualInHouseGamePromotionBanner networkVirtualInHouseGamePromotionBanner;
        String androidAvailableAppVersion;
        String redirectUrl;
        String strH;
        Object objB;
        String str;
        NetworkVirtualInHouseGamePromotionBanner networkVirtualInHouseGamePromotionBanner2;
        Version version;
        Iterator it;
        Object next;
        CMSResponse cMSResponse;
        String value;
        String str2;
        Iterator it2;
        Object next2;
        String value2;
        String str3;
        String iconUrl;
        String str4;
        String backgroundUrl;
        String str5;
        if (x1bVar instanceof mfi0) {
            mfi0Var = (mfi0) x1bVar;
            int i = mfi0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                mfi0Var.i = i - Integer.MIN_VALUE;
            } else {
                mfi0Var = new mfi0(this, x1bVar);
            }
        } else {
            mfi0Var = new mfi0(this, x1bVar);
        }
        Object obj = mfi0Var.e;
        y5b y5bVar = y5b.a;
        int i2 = mfi0Var.i;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                BOConfigParam bOConfigParam2 = BOConfigParam.VirtualInHouseGamePromotionBanner;
                lq1 lq1Var = this.a;
                List listC = a.c(bOConfigParam2);
                mfi0Var.a = this;
                mfi0Var.b = bOConfigParam2;
                mfi0Var.i = 1;
                Object objD = lq1Var.d(listC, mfi0Var);
                if (objD != y5bVar) {
                    ofi0Var = this;
                    bOConfigParam = bOConfigParam2;
                    obj = objD;
                }
                return y5bVar;
            }
            if (i2 == 1) {
                bOConfigParam = mfi0Var.b;
                ofi0Var = mfi0Var.a;
                uj50.b(obj);
            } else {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str6 = mfi0Var.d;
                networkVirtualInHouseGamePromotionBanner2 = mfi0Var.c;
                uj50.b(obj);
                str = str6;
            }
            List list = (List) obj;
            it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(((CMSResponse) next).getKey(), networkVirtualInHouseGamePromotionBanner2.getBodyText()));
            cMSResponse = (CMSResponse) next;
            if (cMSResponse != null) {
                value = cMSResponse.getValue();
            } else {
                value = null;
            }
            if (value == null) {
                str2 = "";
            } else {
                str2 = value;
            }
            it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!Intrinsics.g(((CMSResponse) next2).getKey(), networkVirtualInHouseGamePromotionBanner2.getButtonText()));
            CMSResponse cMSResponse2 = (CMSResponse) next2;
            value2 = cMSResponse2 != null ? cMSResponse2.getValue() : null;
            if (value2 == null) {
                str3 = "";
            } else {
                str3 = value2;
            }
            iconUrl = networkVirtualInHouseGamePromotionBanner2.getIconUrl();
            if (iconUrl == null) {
                str4 = "";
            } else {
                str4 = iconUrl;
            }
            backgroundUrl = networkVirtualInHouseGamePromotionBanner2.getBackgroundUrl();
            if (backgroundUrl == null) {
                str5 = "";
            } else {
                str5 = backgroundUrl;
            }
            lfi0 lfi0Var = new lfi0(str2, str3, str4, str5, str);
            zi50.a aVar2 = zi50.b;
            return lfi0Var;
            BOConfigValueWrapper response = ((BOConfigValueBundle) obj).getResponse(bOConfigParam);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(NetworkVirtualInHouseGamePromotionBanner.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (!(configValue instanceof Integer)) {
                    if (configValue instanceof String) {
                        StringsKt.toIntOrNull((String) configValue);
                    }
                    networkVirtualInHouseGamePromotionBanner = null;
                    if (networkVirtualInHouseGamePromotionBanner != null) {
                        throw new NullPointerException("Promotion banner config is missing.");
                    }
                    if (networkVirtualInHouseGamePromotionBanner.getActive()) {
                        throw new NullPointerException("Promotion banner is inactive.");
                    }
                    androidAvailableAppVersion = networkVirtualInHouseGamePromotionBanner.getAndroidAvailableAppVersion();
                    arm armVar = ofi0Var.e;
                    if (androidAvailableAppVersion != null) {
                        version = new Version(androidAvailableAppVersion);
                        Version version2 = new Version("1.82.2");
                        if (version.isValid()) {
                        }
                        throw new NullPointerException("Promotion banner is not available for the current app version.");
                    }
                    redirectUrl = networkVirtualInHouseGamePromotionBanner.getRedirectUrl();
                    if (redirectUrl != null) {
                        if (!StringsKt.U(redirectUrl)) {
                            redirectUrl = null;
                        }
                        if (redirectUrl != null) {
                            strH = ofi0Var.d.h(redirectUrl);
                            b.a aVar3 = b.b;
                            long jI = c.i(1000L, rgf.MILLISECONDS);
                            nfi0 nfi0Var = new nfi0(ofi0Var, networkVirtualInHouseGamePromotionBanner, null);
                            mfi0Var.a = null;
                            mfi0Var.b = null;
                            mfi0Var.c = networkVirtualInHouseGamePromotionBanner;
                            mfi0Var.d = strH;
                            mfi0Var.i = 2;
                            objB = vxf0.b(hkd.e(jI), nfi0Var, mfi0Var);
                            if (objB != y5bVar) {
                                str = strH;
                                obj = objB;
                                networkVirtualInHouseGamePromotionBanner2 = networkVirtualInHouseGamePromotionBanner;
                                List list2 = (List) obj;
                                it = list2.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!Intrinsics.g(((CMSResponse) next).getKey(), networkVirtualInHouseGamePromotionBanner2.getBodyText()));
                                cMSResponse = (CMSResponse) next;
                                if (cMSResponse != null) {
                                    value = cMSResponse.getValue();
                                } else {
                                    value = null;
                                }
                                if (value == null) {
                                    str2 = "";
                                } else {
                                    str2 = value;
                                }
                                it2 = list2.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it2.next();
                                } while (!Intrinsics.g(((CMSResponse) next2).getKey(), networkVirtualInHouseGamePromotionBanner2.getButtonText()));
                                CMSResponse cMSResponse3 = (CMSResponse) next2;
                                if (cMSResponse3 != null) {
                                }
                                if (value2 == null) {
                                    str3 = "";
                                } else {
                                    str3 = value2;
                                }
                                iconUrl = networkVirtualInHouseGamePromotionBanner2.getIconUrl();
                                if (iconUrl == null) {
                                    str4 = "";
                                } else {
                                    str4 = iconUrl;
                                }
                                backgroundUrl = networkVirtualInHouseGamePromotionBanner2.getBackgroundUrl();
                                if (backgroundUrl == null) {
                                    str5 = "";
                                } else {
                                    str5 = backgroundUrl;
                                }
                                lfi0 lfi0Var2 = new lfi0(str2, str3, str4, str5, str);
                                zi50.a aVar4 = zi50.b;
                                return lfi0Var2;
                            }
                            return y5bVar;
                        }
                    }
                    throw new NullPointerException("Promotion banner redirect URL is missing.");
                }
                if (!(configValue instanceof NetworkVirtualInHouseGamePromotionBanner)) {
                    configValue = null;
                }
                networkVirtualInHouseGamePromotionBanner = (NetworkVirtualInHouseGamePromotionBanner) configValue;
                if (networkVirtualInHouseGamePromotionBanner != null) {
                    throw new NullPointerException("Promotion banner config is missing.");
                }
                if (networkVirtualInHouseGamePromotionBanner.getActive()) {
                    throw new NullPointerException("Promotion banner is inactive.");
                }
                androidAvailableAppVersion = networkVirtualInHouseGamePromotionBanner.getAndroidAvailableAppVersion();
                arm armVar2 = ofi0Var.e;
                if (androidAvailableAppVersion != null && !StringsKt.U(androidAvailableAppVersion)) {
                    version = new Version(androidAvailableAppVersion);
                    Version version3 = new Version("1.82.2");
                    if (version.isValid() || !version3.isValid() || version3.compareTo(version) < 0) {
                        throw new NullPointerException("Promotion banner is not available for the current app version.");
                    }
                }
                redirectUrl = networkVirtualInHouseGamePromotionBanner.getRedirectUrl();
                if (redirectUrl != null) {
                    if (!StringsKt.U(redirectUrl)) {
                        redirectUrl = null;
                    }
                    if (redirectUrl != null) {
                        strH = ofi0Var.d.h(redirectUrl);
                        b.a aVar5 = b.b;
                        long jI2 = c.i(1000L, rgf.MILLISECONDS);
                        nfi0 nfi0Var2 = new nfi0(ofi0Var, networkVirtualInHouseGamePromotionBanner, null);
                        mfi0Var.a = null;
                        mfi0Var.b = null;
                        mfi0Var.c = networkVirtualInHouseGamePromotionBanner;
                        mfi0Var.d = strH;
                        mfi0Var.i = 2;
                        objB = vxf0.b(hkd.e(jI2), nfi0Var2, mfi0Var);
                        if (objB != y5bVar) {
                            str = strH;
                            obj = objB;
                            networkVirtualInHouseGamePromotionBanner2 = networkVirtualInHouseGamePromotionBanner;
                            List list3 = (List) obj;
                            it = list3.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!Intrinsics.g(((CMSResponse) next).getKey(), networkVirtualInHouseGamePromotionBanner2.getBodyText()));
                            cMSResponse = (CMSResponse) next;
                            if (cMSResponse != null) {
                                value = cMSResponse.getValue();
                            } else {
                                value = null;
                            }
                            if (value == null) {
                                str2 = "";
                            } else {
                                str2 = value;
                            }
                            it2 = list3.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (!Intrinsics.g(((CMSResponse) next2).getKey(), networkVirtualInHouseGamePromotionBanner2.getButtonText()));
                            CMSResponse cMSResponse4 = (CMSResponse) next2;
                            if (cMSResponse4 != null) {
                            }
                            if (value2 == null) {
                                str3 = "";
                            } else {
                                str3 = value2;
                            }
                            iconUrl = networkVirtualInHouseGamePromotionBanner2.getIconUrl();
                            if (iconUrl == null) {
                                str4 = "";
                            } else {
                                str4 = iconUrl;
                            }
                            backgroundUrl = networkVirtualInHouseGamePromotionBanner2.getBackgroundUrl();
                            if (backgroundUrl == null) {
                                str5 = "";
                            } else {
                                str5 = backgroundUrl;
                            }
                            lfi0 lfi0Var3 = new lfi0(str2, str3, str4, str5, str);
                            zi50.a aVar6 = zi50.b;
                            return lfi0Var3;
                        }
                        return y5bVar;
                    }
                }
                throw new NullPointerException("Promotion banner redirect URL is missing.");
            }
            if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (!(configValue instanceof NetworkVirtualInHouseGamePromotionBanner)) {
                        configValue = null;
                    }
                    networkVirtualInHouseGamePromotionBanner = (NetworkVirtualInHouseGamePromotionBanner) configValue;
                    if (networkVirtualInHouseGamePromotionBanner != null) {
                        throw new NullPointerException("Promotion banner config is missing.");
                    }
                    if (networkVirtualInHouseGamePromotionBanner.getActive()) {
                        throw new NullPointerException("Promotion banner is inactive.");
                    }
                    androidAvailableAppVersion = networkVirtualInHouseGamePromotionBanner.getAndroidAvailableAppVersion();
                    arm armVar3 = ofi0Var.e;
                    if (androidAvailableAppVersion != null) {
                        version = new Version(androidAvailableAppVersion);
                        Version version4 = new Version("1.82.2");
                        if (version.isValid()) {
                        }
                        throw new NullPointerException("Promotion banner is not available for the current app version.");
                    }
                    redirectUrl = networkVirtualInHouseGamePromotionBanner.getRedirectUrl();
                    if (redirectUrl != null) {
                        if (!StringsKt.U(redirectUrl)) {
                            redirectUrl = null;
                        }
                        if (redirectUrl != null) {
                            strH = ofi0Var.d.h(redirectUrl);
                            b.a aVar7 = b.b;
                            long jI3 = c.i(1000L, rgf.MILLISECONDS);
                            nfi0 nfi0Var3 = new nfi0(ofi0Var, networkVirtualInHouseGamePromotionBanner, null);
                            mfi0Var.a = null;
                            mfi0Var.b = null;
                            mfi0Var.c = networkVirtualInHouseGamePromotionBanner;
                            mfi0Var.d = strH;
                            mfi0Var.i = 2;
                            objB = vxf0.b(hkd.e(jI3), nfi0Var3, mfi0Var);
                            if (objB != y5bVar) {
                                str = strH;
                                obj = objB;
                                networkVirtualInHouseGamePromotionBanner2 = networkVirtualInHouseGamePromotionBanner;
                                List list4 = (List) obj;
                                it = list4.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!Intrinsics.g(((CMSResponse) next).getKey(), networkVirtualInHouseGamePromotionBanner2.getBodyText()));
                                cMSResponse = (CMSResponse) next;
                                if (cMSResponse != null) {
                                    value = cMSResponse.getValue();
                                } else {
                                    value = null;
                                }
                                if (value == null) {
                                    str2 = "";
                                } else {
                                    str2 = value;
                                }
                                it2 = list4.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it2.next();
                                } while (!Intrinsics.g(((CMSResponse) next2).getKey(), networkVirtualInHouseGamePromotionBanner2.getButtonText()));
                                CMSResponse cMSResponse5 = (CMSResponse) next2;
                                if (cMSResponse5 != null) {
                                }
                                if (value2 == null) {
                                    str3 = "";
                                } else {
                                    str3 = value2;
                                }
                                iconUrl = networkVirtualInHouseGamePromotionBanner2.getIconUrl();
                                if (iconUrl == null) {
                                    str4 = "";
                                } else {
                                    str4 = iconUrl;
                                }
                                backgroundUrl = networkVirtualInHouseGamePromotionBanner2.getBackgroundUrl();
                                if (backgroundUrl == null) {
                                    str5 = "";
                                } else {
                                    str5 = backgroundUrl;
                                }
                                lfi0 lfi0Var4 = new lfi0(str2, str3, str4, str5, str);
                                zi50.a aVar8 = zi50.b;
                                return lfi0Var4;
                            }
                            return y5bVar;
                        }
                    }
                    throw new NullPointerException("Promotion banner redirect URL is missing.");
                }
                if (configValue instanceof String) {
                    StringsKt.s0((String) configValue);
                }
                networkVirtualInHouseGamePromotionBanner = null;
                if (networkVirtualInHouseGamePromotionBanner != null) {
                    throw new NullPointerException("Promotion banner config is missing.");
                }
                if (networkVirtualInHouseGamePromotionBanner.getActive()) {
                    throw new NullPointerException("Promotion banner is inactive.");
                }
                androidAvailableAppVersion = networkVirtualInHouseGamePromotionBanner.getAndroidAvailableAppVersion();
                arm armVar4 = ofi0Var.e;
                if (androidAvailableAppVersion != null) {
                    version = new Version(androidAvailableAppVersion);
                    Version version5 = new Version("1.82.2");
                    if (version.isValid()) {
                    }
                    throw new NullPointerException("Promotion banner is not available for the current app version.");
                }
                redirectUrl = networkVirtualInHouseGamePromotionBanner.getRedirectUrl();
                if (redirectUrl != null) {
                    if (!StringsKt.U(redirectUrl)) {
                        redirectUrl = null;
                    }
                    if (redirectUrl != null) {
                        strH = ofi0Var.d.h(redirectUrl);
                        b.a aVar9 = b.b;
                        long jI4 = c.i(1000L, rgf.MILLISECONDS);
                        nfi0 nfi0Var4 = new nfi0(ofi0Var, networkVirtualInHouseGamePromotionBanner, null);
                        mfi0Var.a = null;
                        mfi0Var.b = null;
                        mfi0Var.c = networkVirtualInHouseGamePromotionBanner;
                        mfi0Var.d = strH;
                        mfi0Var.i = 2;
                        objB = vxf0.b(hkd.e(jI4), nfi0Var4, mfi0Var);
                        if (objB != y5bVar) {
                            str = strH;
                            obj = objB;
                            networkVirtualInHouseGamePromotionBanner2 = networkVirtualInHouseGamePromotionBanner;
                            List list5 = (List) obj;
                            it = list5.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!Intrinsics.g(((CMSResponse) next).getKey(), networkVirtualInHouseGamePromotionBanner2.getBodyText()));
                            cMSResponse = (CMSResponse) next;
                            if (cMSResponse != null) {
                                value = cMSResponse.getValue();
                            } else {
                                value = null;
                            }
                            if (value == null) {
                                str2 = "";
                            } else {
                                str2 = value;
                            }
                            it2 = list5.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (!Intrinsics.g(((CMSResponse) next2).getKey(), networkVirtualInHouseGamePromotionBanner2.getButtonText()));
                            CMSResponse cMSResponse6 = (CMSResponse) next2;
                            if (cMSResponse6 != null) {
                            }
                            if (value2 == null) {
                                str3 = "";
                            } else {
                                str3 = value2;
                            }
                            iconUrl = networkVirtualInHouseGamePromotionBanner2.getIconUrl();
                            if (iconUrl == null) {
                                str4 = "";
                            } else {
                                str4 = iconUrl;
                            }
                            backgroundUrl = networkVirtualInHouseGamePromotionBanner2.getBackgroundUrl();
                            if (backgroundUrl == null) {
                                str5 = "";
                            } else {
                                str5 = backgroundUrl;
                            }
                            lfi0 lfi0Var5 = new lfi0(str2, str3, str4, str5, str);
                            zi50.a aVar10 = zi50.b;
                            return lfi0Var5;
                        }
                        return y5bVar;
                    }
                }
                throw new NullPointerException("Promotion banner redirect URL is missing.");
            }
            if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (!(configValue instanceof NetworkVirtualInHouseGamePromotionBanner)) {
                        configValue = null;
                    }
                    networkVirtualInHouseGamePromotionBanner = (NetworkVirtualInHouseGamePromotionBanner) configValue;
                    if (networkVirtualInHouseGamePromotionBanner != null) {
                        throw new NullPointerException("Promotion banner config is missing.");
                    }
                    if (networkVirtualInHouseGamePromotionBanner.getActive()) {
                        throw new NullPointerException("Promotion banner is inactive.");
                    }
                    androidAvailableAppVersion = networkVirtualInHouseGamePromotionBanner.getAndroidAvailableAppVersion();
                    arm armVar5 = ofi0Var.e;
                    if (androidAvailableAppVersion != null) {
                        version = new Version(androidAvailableAppVersion);
                        Version version6 = new Version("1.82.2");
                        if (version.isValid()) {
                        }
                        throw new NullPointerException("Promotion banner is not available for the current app version.");
                    }
                    redirectUrl = networkVirtualInHouseGamePromotionBanner.getRedirectUrl();
                    if (redirectUrl != null) {
                        if (!StringsKt.U(redirectUrl)) {
                            redirectUrl = null;
                        }
                        if (redirectUrl != null) {
                            strH = ofi0Var.d.h(redirectUrl);
                            b.a aVar11 = b.b;
                            long jI5 = c.i(1000L, rgf.MILLISECONDS);
                            nfi0 nfi0Var5 = new nfi0(ofi0Var, networkVirtualInHouseGamePromotionBanner, null);
                            mfi0Var.a = null;
                            mfi0Var.b = null;
                            mfi0Var.c = networkVirtualInHouseGamePromotionBanner;
                            mfi0Var.d = strH;
                            mfi0Var.i = 2;
                            objB = vxf0.b(hkd.e(jI5), nfi0Var5, mfi0Var);
                            if (objB != y5bVar) {
                                str = strH;
                                obj = objB;
                                networkVirtualInHouseGamePromotionBanner2 = networkVirtualInHouseGamePromotionBanner;
                                List list6 = (List) obj;
                                it = list6.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!Intrinsics.g(((CMSResponse) next).getKey(), networkVirtualInHouseGamePromotionBanner2.getBodyText()));
                                cMSResponse = (CMSResponse) next;
                                if (cMSResponse != null) {
                                    value = cMSResponse.getValue();
                                } else {
                                    value = null;
                                }
                                if (value == null) {
                                    str2 = "";
                                } else {
                                    str2 = value;
                                }
                                it2 = list6.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it2.next();
                                } while (!Intrinsics.g(((CMSResponse) next2).getKey(), networkVirtualInHouseGamePromotionBanner2.getButtonText()));
                                CMSResponse cMSResponse7 = (CMSResponse) next2;
                                if (cMSResponse7 != null) {
                                }
                                if (value2 == null) {
                                    str3 = "";
                                } else {
                                    str3 = value2;
                                }
                                iconUrl = networkVirtualInHouseGamePromotionBanner2.getIconUrl();
                                if (iconUrl == null) {
                                    str4 = "";
                                } else {
                                    str4 = iconUrl;
                                }
                                backgroundUrl = networkVirtualInHouseGamePromotionBanner2.getBackgroundUrl();
                                if (backgroundUrl == null) {
                                    str5 = "";
                                } else {
                                    str5 = backgroundUrl;
                                }
                                lfi0 lfi0Var6 = new lfi0(str2, str3, str4, str5, str);
                                zi50.a aVar12 = zi50.b;
                                return lfi0Var6;
                            }
                            return y5bVar;
                        }
                    }
                    throw new NullPointerException("Promotion banner redirect URL is missing.");
                }
                if (configValue instanceof String) {
                    kotlin.text.b.i((String) configValue);
                }
                networkVirtualInHouseGamePromotionBanner = null;
                if (networkVirtualInHouseGamePromotionBanner != null) {
                    throw new NullPointerException("Promotion banner config is missing.");
                }
                if (networkVirtualInHouseGamePromotionBanner.getActive()) {
                    throw new NullPointerException("Promotion banner is inactive.");
                }
                androidAvailableAppVersion = networkVirtualInHouseGamePromotionBanner.getAndroidAvailableAppVersion();
                arm armVar6 = ofi0Var.e;
                if (androidAvailableAppVersion != null) {
                    version = new Version(androidAvailableAppVersion);
                    Version version7 = new Version("1.82.2");
                    if (version.isValid()) {
                    }
                    throw new NullPointerException("Promotion banner is not available for the current app version.");
                }
                redirectUrl = networkVirtualInHouseGamePromotionBanner.getRedirectUrl();
                if (redirectUrl != null) {
                    if (!StringsKt.U(redirectUrl)) {
                        redirectUrl = null;
                    }
                    if (redirectUrl != null) {
                        strH = ofi0Var.d.h(redirectUrl);
                        b.a aVar13 = b.b;
                        long jI6 = c.i(1000L, rgf.MILLISECONDS);
                        nfi0 nfi0Var6 = new nfi0(ofi0Var, networkVirtualInHouseGamePromotionBanner, null);
                        mfi0Var.a = null;
                        mfi0Var.b = null;
                        mfi0Var.c = networkVirtualInHouseGamePromotionBanner;
                        mfi0Var.d = strH;
                        mfi0Var.i = 2;
                        objB = vxf0.b(hkd.e(jI6), nfi0Var6, mfi0Var);
                        if (objB != y5bVar) {
                            str = strH;
                            obj = objB;
                            networkVirtualInHouseGamePromotionBanner2 = networkVirtualInHouseGamePromotionBanner;
                            List list7 = (List) obj;
                            it = list7.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!Intrinsics.g(((CMSResponse) next).getKey(), networkVirtualInHouseGamePromotionBanner2.getBodyText()));
                            cMSResponse = (CMSResponse) next;
                            if (cMSResponse != null) {
                                value = cMSResponse.getValue();
                            } else {
                                value = null;
                            }
                            if (value == null) {
                                str2 = "";
                            } else {
                                str2 = value;
                            }
                            it2 = list7.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (!Intrinsics.g(((CMSResponse) next2).getKey(), networkVirtualInHouseGamePromotionBanner2.getButtonText()));
                            CMSResponse cMSResponse8 = (CMSResponse) next2;
                            if (cMSResponse8 != null) {
                            }
                            if (value2 == null) {
                                str3 = "";
                            } else {
                                str3 = value2;
                            }
                            iconUrl = networkVirtualInHouseGamePromotionBanner2.getIconUrl();
                            if (iconUrl == null) {
                                str4 = "";
                            } else {
                                str4 = iconUrl;
                            }
                            backgroundUrl = networkVirtualInHouseGamePromotionBanner2.getBackgroundUrl();
                            if (backgroundUrl == null) {
                                str5 = "";
                            } else {
                                str5 = backgroundUrl;
                            }
                            lfi0 lfi0Var7 = new lfi0(str2, str3, str4, str5, str);
                            zi50.a aVar14 = zi50.b;
                            return lfi0Var7;
                        }
                        return y5bVar;
                    }
                }
                throw new NullPointerException("Promotion banner redirect URL is missing.");
            }
            if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (!(configValue instanceof NetworkVirtualInHouseGamePromotionBanner)) {
                        configValue = null;
                    }
                    networkVirtualInHouseGamePromotionBanner = (NetworkVirtualInHouseGamePromotionBanner) configValue;
                    if (networkVirtualInHouseGamePromotionBanner != null) {
                        throw new NullPointerException("Promotion banner config is missing.");
                    }
                    if (networkVirtualInHouseGamePromotionBanner.getActive()) {
                        throw new NullPointerException("Promotion banner is inactive.");
                    }
                    androidAvailableAppVersion = networkVirtualInHouseGamePromotionBanner.getAndroidAvailableAppVersion();
                    arm armVar7 = ofi0Var.e;
                    if (androidAvailableAppVersion != null) {
                        version = new Version(androidAvailableAppVersion);
                        Version version8 = new Version("1.82.2");
                        if (version.isValid()) {
                        }
                        throw new NullPointerException("Promotion banner is not available for the current app version.");
                    }
                    redirectUrl = networkVirtualInHouseGamePromotionBanner.getRedirectUrl();
                    if (redirectUrl != null) {
                        if (!StringsKt.U(redirectUrl)) {
                            redirectUrl = null;
                        }
                        if (redirectUrl != null) {
                            strH = ofi0Var.d.h(redirectUrl);
                            b.a aVar15 = b.b;
                            long jI7 = c.i(1000L, rgf.MILLISECONDS);
                            nfi0 nfi0Var7 = new nfi0(ofi0Var, networkVirtualInHouseGamePromotionBanner, null);
                            mfi0Var.a = null;
                            mfi0Var.b = null;
                            mfi0Var.c = networkVirtualInHouseGamePromotionBanner;
                            mfi0Var.d = strH;
                            mfi0Var.i = 2;
                            objB = vxf0.b(hkd.e(jI7), nfi0Var7, mfi0Var);
                            if (objB != y5bVar) {
                                str = strH;
                                obj = objB;
                                networkVirtualInHouseGamePromotionBanner2 = networkVirtualInHouseGamePromotionBanner;
                                List list8 = (List) obj;
                                it = list8.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!Intrinsics.g(((CMSResponse) next).getKey(), networkVirtualInHouseGamePromotionBanner2.getBodyText()));
                                cMSResponse = (CMSResponse) next;
                                if (cMSResponse != null) {
                                    value = cMSResponse.getValue();
                                } else {
                                    value = null;
                                }
                                if (value == null) {
                                    str2 = "";
                                } else {
                                    str2 = value;
                                }
                                it2 = list8.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it2.next();
                                } while (!Intrinsics.g(((CMSResponse) next2).getKey(), networkVirtualInHouseGamePromotionBanner2.getButtonText()));
                                CMSResponse cMSResponse9 = (CMSResponse) next2;
                                if (cMSResponse9 != null) {
                                }
                                if (value2 == null) {
                                    str3 = "";
                                } else {
                                    str3 = value2;
                                }
                                iconUrl = networkVirtualInHouseGamePromotionBanner2.getIconUrl();
                                if (iconUrl == null) {
                                    str4 = "";
                                } else {
                                    str4 = iconUrl;
                                }
                                backgroundUrl = networkVirtualInHouseGamePromotionBanner2.getBackgroundUrl();
                                if (backgroundUrl == null) {
                                    str5 = "";
                                } else {
                                    str5 = backgroundUrl;
                                }
                                lfi0 lfi0Var8 = new lfi0(str2, str3, str4, str5, str);
                                zi50.a aVar16 = zi50.b;
                                return lfi0Var8;
                            }
                            return y5bVar;
                        }
                    }
                    throw new NullPointerException("Promotion banner redirect URL is missing.");
                }
                if (configValue instanceof String) {
                    kotlin.text.b.h((String) configValue);
                }
                networkVirtualInHouseGamePromotionBanner = null;
                if (networkVirtualInHouseGamePromotionBanner != null) {
                    throw new NullPointerException("Promotion banner config is missing.");
                }
                if (networkVirtualInHouseGamePromotionBanner.getActive()) {
                    throw new NullPointerException("Promotion banner is inactive.");
                }
                androidAvailableAppVersion = networkVirtualInHouseGamePromotionBanner.getAndroidAvailableAppVersion();
                arm armVar8 = ofi0Var.e;
                if (androidAvailableAppVersion != null) {
                    version = new Version(androidAvailableAppVersion);
                    Version version9 = new Version("1.82.2");
                    if (version.isValid()) {
                    }
                    throw new NullPointerException("Promotion banner is not available for the current app version.");
                }
                redirectUrl = networkVirtualInHouseGamePromotionBanner.getRedirectUrl();
                if (redirectUrl != null) {
                    if (!StringsKt.U(redirectUrl)) {
                        redirectUrl = null;
                    }
                    if (redirectUrl != null) {
                        strH = ofi0Var.d.h(redirectUrl);
                        b.a aVar17 = b.b;
                        long jI8 = c.i(1000L, rgf.MILLISECONDS);
                        nfi0 nfi0Var8 = new nfi0(ofi0Var, networkVirtualInHouseGamePromotionBanner, null);
                        mfi0Var.a = null;
                        mfi0Var.b = null;
                        mfi0Var.c = networkVirtualInHouseGamePromotionBanner;
                        mfi0Var.d = strH;
                        mfi0Var.i = 2;
                        objB = vxf0.b(hkd.e(jI8), nfi0Var8, mfi0Var);
                        if (objB != y5bVar) {
                            str = strH;
                            obj = objB;
                            networkVirtualInHouseGamePromotionBanner2 = networkVirtualInHouseGamePromotionBanner;
                            List list9 = (List) obj;
                            it = list9.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!Intrinsics.g(((CMSResponse) next).getKey(), networkVirtualInHouseGamePromotionBanner2.getBodyText()));
                            cMSResponse = (CMSResponse) next;
                            if (cMSResponse != null) {
                                value = cMSResponse.getValue();
                            } else {
                                value = null;
                            }
                            if (value == null) {
                                str2 = "";
                            } else {
                                str2 = value;
                            }
                            it2 = list9.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (!Intrinsics.g(((CMSResponse) next2).getKey(), networkVirtualInHouseGamePromotionBanner2.getButtonText()));
                            CMSResponse cMSResponse10 = (CMSResponse) next2;
                            if (cMSResponse10 != null) {
                            }
                            if (value2 == null) {
                                str3 = "";
                            } else {
                                str3 = value2;
                            }
                            iconUrl = networkVirtualInHouseGamePromotionBanner2.getIconUrl();
                            if (iconUrl == null) {
                                str4 = "";
                            } else {
                                str4 = iconUrl;
                            }
                            backgroundUrl = networkVirtualInHouseGamePromotionBanner2.getBackgroundUrl();
                            if (backgroundUrl == null) {
                                str5 = "";
                            } else {
                                str5 = backgroundUrl;
                            }
                            lfi0 lfi0Var9 = new lfi0(str2, str3, str4, str5, str);
                            zi50.a aVar18 = zi50.b;
                            return lfi0Var9;
                        }
                        return y5bVar;
                    }
                }
                throw new NullPointerException("Promotion banner redirect URL is missing.");
            }
            if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    if (!(configValue instanceof NetworkVirtualInHouseGamePromotionBanner)) {
                        configValue = null;
                    }
                    networkVirtualInHouseGamePromotionBanner = (NetworkVirtualInHouseGamePromotionBanner) configValue;
                    if (networkVirtualInHouseGamePromotionBanner != null) {
                        throw new NullPointerException("Promotion banner config is missing.");
                    }
                    if (networkVirtualInHouseGamePromotionBanner.getActive()) {
                        throw new NullPointerException("Promotion banner is inactive.");
                    }
                    androidAvailableAppVersion = networkVirtualInHouseGamePromotionBanner.getAndroidAvailableAppVersion();
                    arm armVar9 = ofi0Var.e;
                    if (androidAvailableAppVersion != null) {
                        version = new Version(androidAvailableAppVersion);
                        Version version10 = new Version("1.82.2");
                        if (version.isValid()) {
                        }
                        throw new NullPointerException("Promotion banner is not available for the current app version.");
                    }
                    redirectUrl = networkVirtualInHouseGamePromotionBanner.getRedirectUrl();
                    if (redirectUrl != null) {
                        if (!StringsKt.U(redirectUrl)) {
                            redirectUrl = null;
                        }
                        if (redirectUrl != null) {
                            strH = ofi0Var.d.h(redirectUrl);
                            b.a aVar19 = b.b;
                            long jI9 = c.i(1000L, rgf.MILLISECONDS);
                            nfi0 nfi0Var9 = new nfi0(ofi0Var, networkVirtualInHouseGamePromotionBanner, null);
                            mfi0Var.a = null;
                            mfi0Var.b = null;
                            mfi0Var.c = networkVirtualInHouseGamePromotionBanner;
                            mfi0Var.d = strH;
                            mfi0Var.i = 2;
                            objB = vxf0.b(hkd.e(jI9), nfi0Var9, mfi0Var);
                            if (objB != y5bVar) {
                                str = strH;
                                obj = objB;
                                networkVirtualInHouseGamePromotionBanner2 = networkVirtualInHouseGamePromotionBanner;
                                List list10 = (List) obj;
                                it = list10.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!Intrinsics.g(((CMSResponse) next).getKey(), networkVirtualInHouseGamePromotionBanner2.getBodyText()));
                                cMSResponse = (CMSResponse) next;
                                if (cMSResponse != null) {
                                    value = cMSResponse.getValue();
                                } else {
                                    value = null;
                                }
                                if (value == null) {
                                    str2 = "";
                                } else {
                                    str2 = value;
                                }
                                it2 = list10.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it2.next();
                                } while (!Intrinsics.g(((CMSResponse) next2).getKey(), networkVirtualInHouseGamePromotionBanner2.getButtonText()));
                                CMSResponse cMSResponse11 = (CMSResponse) next2;
                                if (cMSResponse11 != null) {
                                }
                                if (value2 == null) {
                                    str3 = "";
                                } else {
                                    str3 = value2;
                                }
                                iconUrl = networkVirtualInHouseGamePromotionBanner2.getIconUrl();
                                if (iconUrl == null) {
                                    str4 = "";
                                } else {
                                    str4 = iconUrl;
                                }
                                backgroundUrl = networkVirtualInHouseGamePromotionBanner2.getBackgroundUrl();
                                if (backgroundUrl == null) {
                                    str5 = "";
                                } else {
                                    str5 = backgroundUrl;
                                }
                                lfi0 lfi0Var10 = new lfi0(str2, str3, str4, str5, str);
                                zi50.a aVar110 = zi50.b;
                                return lfi0Var10;
                            }
                            return y5bVar;
                        }
                    }
                    throw new NullPointerException("Promotion banner redirect URL is missing.");
                }
                if (configValue instanceof String) {
                    StringsKt.r0((String) configValue);
                }
                networkVirtualInHouseGamePromotionBanner = null;
                if (networkVirtualInHouseGamePromotionBanner != null) {
                    throw new NullPointerException("Promotion banner config is missing.");
                }
                if (networkVirtualInHouseGamePromotionBanner.getActive()) {
                    throw new NullPointerException("Promotion banner is inactive.");
                }
                androidAvailableAppVersion = networkVirtualInHouseGamePromotionBanner.getAndroidAvailableAppVersion();
                arm armVar10 = ofi0Var.e;
                if (androidAvailableAppVersion != null) {
                    version = new Version(androidAvailableAppVersion);
                    Version version11 = new Version("1.82.2");
                    if (version.isValid()) {
                    }
                    throw new NullPointerException("Promotion banner is not available for the current app version.");
                }
                redirectUrl = networkVirtualInHouseGamePromotionBanner.getRedirectUrl();
                if (redirectUrl != null) {
                    if (!StringsKt.U(redirectUrl)) {
                        redirectUrl = null;
                    }
                    if (redirectUrl != null) {
                        strH = ofi0Var.d.h(redirectUrl);
                        b.a aVar111 = b.b;
                        long jI10 = c.i(1000L, rgf.MILLISECONDS);
                        nfi0 nfi0Var10 = new nfi0(ofi0Var, networkVirtualInHouseGamePromotionBanner, null);
                        mfi0Var.a = null;
                        mfi0Var.b = null;
                        mfi0Var.c = networkVirtualInHouseGamePromotionBanner;
                        mfi0Var.d = strH;
                        mfi0Var.i = 2;
                        objB = vxf0.b(hkd.e(jI10), nfi0Var10, mfi0Var);
                        if (objB != y5bVar) {
                            str = strH;
                            obj = objB;
                            networkVirtualInHouseGamePromotionBanner2 = networkVirtualInHouseGamePromotionBanner;
                            List list11 = (List) obj;
                            it = list11.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!Intrinsics.g(((CMSResponse) next).getKey(), networkVirtualInHouseGamePromotionBanner2.getBodyText()));
                            cMSResponse = (CMSResponse) next;
                            if (cMSResponse != null) {
                                value = cMSResponse.getValue();
                            } else {
                                value = null;
                            }
                            if (value == null) {
                                str2 = "";
                            } else {
                                str2 = value;
                            }
                            it2 = list11.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (!Intrinsics.g(((CMSResponse) next2).getKey(), networkVirtualInHouseGamePromotionBanner2.getButtonText()));
                            CMSResponse cMSResponse12 = (CMSResponse) next2;
                            if (cMSResponse12 != null) {
                            }
                            if (value2 == null) {
                                str3 = "";
                            } else {
                                str3 = value2;
                            }
                            iconUrl = networkVirtualInHouseGamePromotionBanner2.getIconUrl();
                            if (iconUrl == null) {
                                str4 = "";
                            } else {
                                str4 = iconUrl;
                            }
                            backgroundUrl = networkVirtualInHouseGamePromotionBanner2.getBackgroundUrl();
                            if (backgroundUrl == null) {
                                str5 = "";
                            } else {
                                str5 = backgroundUrl;
                            }
                            lfi0 lfi0Var11 = new lfi0(str2, str3, str4, str5, str);
                            zi50.a aVar112 = zi50.b;
                            return lfi0Var11;
                        }
                        return y5bVar;
                    }
                }
                throw new NullPointerException("Promotion banner redirect URL is missing.");
            }
            if (!dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null) {
                    if (!(configValue instanceof NetworkVirtualInHouseGamePromotionBanner)) {
                        configValue = null;
                    }
                    networkVirtualInHouseGamePromotionBanner = (NetworkVirtualInHouseGamePromotionBanner) configValue;
                }
                if (networkVirtualInHouseGamePromotionBanner != null) {
                    throw new NullPointerException("Promotion banner config is missing.");
                }
                if (networkVirtualInHouseGamePromotionBanner.getActive()) {
                    throw new NullPointerException("Promotion banner is inactive.");
                }
                androidAvailableAppVersion = networkVirtualInHouseGamePromotionBanner.getAndroidAvailableAppVersion();
                arm armVar11 = ofi0Var.e;
                if (androidAvailableAppVersion != null) {
                    version = new Version(androidAvailableAppVersion);
                    Version version12 = new Version("1.82.2");
                    if (version.isValid()) {
                    }
                    throw new NullPointerException("Promotion banner is not available for the current app version.");
                }
                redirectUrl = networkVirtualInHouseGamePromotionBanner.getRedirectUrl();
                if (redirectUrl != null) {
                    if (!StringsKt.U(redirectUrl)) {
                        redirectUrl = null;
                    }
                    if (redirectUrl != null) {
                        strH = ofi0Var.d.h(redirectUrl);
                        b.a aVar113 = b.b;
                        long jI11 = c.i(1000L, rgf.MILLISECONDS);
                        nfi0 nfi0Var11 = new nfi0(ofi0Var, networkVirtualInHouseGamePromotionBanner, null);
                        mfi0Var.a = null;
                        mfi0Var.b = null;
                        mfi0Var.c = networkVirtualInHouseGamePromotionBanner;
                        mfi0Var.d = strH;
                        mfi0Var.i = 2;
                        objB = vxf0.b(hkd.e(jI11), nfi0Var11, mfi0Var);
                        if (objB != y5bVar) {
                            str = strH;
                            obj = objB;
                            networkVirtualInHouseGamePromotionBanner2 = networkVirtualInHouseGamePromotionBanner;
                            List list12 = (List) obj;
                            it = list12.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!Intrinsics.g(((CMSResponse) next).getKey(), networkVirtualInHouseGamePromotionBanner2.getBodyText()));
                            cMSResponse = (CMSResponse) next;
                            if (cMSResponse != null) {
                                value = cMSResponse.getValue();
                            } else {
                                value = null;
                            }
                            if (value == null) {
                                str2 = "";
                            } else {
                                str2 = value;
                            }
                            it2 = list12.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (!Intrinsics.g(((CMSResponse) next2).getKey(), networkVirtualInHouseGamePromotionBanner2.getButtonText()));
                            CMSResponse cMSResponse13 = (CMSResponse) next2;
                            if (cMSResponse13 != null) {
                            }
                            if (value2 == null) {
                                str3 = "";
                            } else {
                                str3 = value2;
                            }
                            iconUrl = networkVirtualInHouseGamePromotionBanner2.getIconUrl();
                            if (iconUrl == null) {
                                str4 = "";
                            } else {
                                str4 = iconUrl;
                            }
                            backgroundUrl = networkVirtualInHouseGamePromotionBanner2.getBackgroundUrl();
                            if (backgroundUrl == null) {
                                str5 = "";
                            } else {
                                str5 = backgroundUrl;
                            }
                            lfi0 lfi0Var12 = new lfi0(str2, str3, str4, str5, str);
                            zi50.a aVar114 = zi50.b;
                            return lfi0Var12;
                        }
                        return y5bVar;
                    }
                }
                throw new NullPointerException("Promotion banner redirect URL is missing.");
            }
            if (configValue != null) {
                configValue.toString();
            }
            networkVirtualInHouseGamePromotionBanner = null;
            if (networkVirtualInHouseGamePromotionBanner != null) {
                throw new NullPointerException("Promotion banner config is missing.");
            }
            if (networkVirtualInHouseGamePromotionBanner.getActive()) {
                throw new NullPointerException("Promotion banner is inactive.");
            }
            androidAvailableAppVersion = networkVirtualInHouseGamePromotionBanner.getAndroidAvailableAppVersion();
            arm armVar12 = ofi0Var.e;
            if (androidAvailableAppVersion != null) {
                version = new Version(androidAvailableAppVersion);
                Version version13 = new Version("1.82.2");
                if (version.isValid()) {
                }
                throw new NullPointerException("Promotion banner is not available for the current app version.");
            }
            redirectUrl = networkVirtualInHouseGamePromotionBanner.getRedirectUrl();
            if (redirectUrl != null) {
                if (!StringsKt.U(redirectUrl)) {
                    redirectUrl = null;
                }
                if (redirectUrl != null) {
                    strH = ofi0Var.d.h(redirectUrl);
                    b.a aVar115 = b.b;
                    long jI12 = c.i(1000L, rgf.MILLISECONDS);
                    nfi0 nfi0Var12 = new nfi0(ofi0Var, networkVirtualInHouseGamePromotionBanner, null);
                    mfi0Var.a = null;
                    mfi0Var.b = null;
                    mfi0Var.c = networkVirtualInHouseGamePromotionBanner;
                    mfi0Var.d = strH;
                    mfi0Var.i = 2;
                    objB = vxf0.b(hkd.e(jI12), nfi0Var12, mfi0Var);
                    if (objB != y5bVar) {
                        str = strH;
                        obj = objB;
                        networkVirtualInHouseGamePromotionBanner2 = networkVirtualInHouseGamePromotionBanner;
                        List list13 = (List) obj;
                        it = list13.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.g(((CMSResponse) next).getKey(), networkVirtualInHouseGamePromotionBanner2.getBodyText()));
                        cMSResponse = (CMSResponse) next;
                        if (cMSResponse != null) {
                            value = cMSResponse.getValue();
                        } else {
                            value = null;
                        }
                        if (value == null) {
                            str2 = "";
                        } else {
                            str2 = value;
                        }
                        it2 = list13.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                        } while (!Intrinsics.g(((CMSResponse) next2).getKey(), networkVirtualInHouseGamePromotionBanner2.getButtonText()));
                        CMSResponse cMSResponse14 = (CMSResponse) next2;
                        if (cMSResponse14 != null) {
                        }
                        if (value2 == null) {
                            str3 = "";
                        } else {
                            str3 = value2;
                        }
                        iconUrl = networkVirtualInHouseGamePromotionBanner2.getIconUrl();
                        if (iconUrl == null) {
                            str4 = "";
                        } else {
                            str4 = iconUrl;
                        }
                        backgroundUrl = networkVirtualInHouseGamePromotionBanner2.getBackgroundUrl();
                        if (backgroundUrl == null) {
                            str5 = "";
                        } else {
                            str5 = backgroundUrl;
                        }
                        lfi0 lfi0Var13 = new lfi0(str2, str3, str4, str5, str);
                        zi50.a aVar116 = zi50.b;
                        return lfi0Var13;
                    }
                    return y5bVar;
                }
            }
            throw new NullPointerException("Promotion banner redirect URL is missing.");
        } catch (Throwable th) {
            zi50.a aVar20 = zi50.b;
            return new zi50.b(th);
        }
    }
}
