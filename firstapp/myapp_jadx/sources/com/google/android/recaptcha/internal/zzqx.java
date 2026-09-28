package com.google.android.recaptcha.internal;

import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
final class zzqx implements zzsr {
    static final zzsr zza = new zzqx();

    private zzqx() {
    }

    @Override // com.google.android.recaptcha.internal.zzsr
    public final boolean zza(int i) {
        zzqy zzqyVar;
        zzqy zzqyVar2 = zzqy.EDITION_UNKNOWN;
        if (i == 0) {
            zzqyVar = zzqy.EDITION_UNKNOWN;
        } else if (i == 1) {
            zzqyVar = zzqy.EDITION_1_TEST_ONLY;
        } else if (i == 2) {
            zzqyVar = zzqy.EDITION_2_TEST_ONLY;
        } else if (i == 900) {
            zzqyVar = zzqy.EDITION_LEGACY;
        } else if (i != Integer.MAX_VALUE) {
            switch (i) {
                case 998:
                    zzqyVar = zzqy.EDITION_PROTO2;
                    break;
                case 999:
                    zzqyVar = zzqy.EDITION_PROTO3;
                    break;
                case 1000:
                    zzqyVar = zzqy.EDITION_2023;
                    break;
                case WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY /* 1001 */:
                    zzqyVar = zzqy.EDITION_2024;
                    break;
                default:
                    switch (i) {
                        case 99997:
                            zzqyVar = zzqy.EDITION_99997_TEST_ONLY;
                            break;
                        case 99998:
                            zzqyVar = zzqy.EDITION_99998_TEST_ONLY;
                            break;
                        case 99999:
                            zzqyVar = zzqy.EDITION_99999_TEST_ONLY;
                            break;
                        default:
                            zzqyVar = null;
                            break;
                    }
                    break;
            }
        } else {
            zzqyVar = zzqy.EDITION_MAX;
        }
        return zzqyVar != null;
    }
}
