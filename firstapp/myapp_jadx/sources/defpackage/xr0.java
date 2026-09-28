package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xr0 extends y3l {
    @Override // defpackage.y3l
    public final uov d(apv apvVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            msz mszVar = new msz(byteBuffer.limit(), byteBuffer.array());
            mszVar.o(12);
            int iD = (mszVar.d() + mszVar.g(12)) - 4;
            mszVar.o(44);
            mszVar.p(mszVar.g(12));
            mszVar.o(16);
            ArrayList arrayList = new ArrayList();
            while (mszVar.d() < iD) {
                mszVar.o(48);
                int iG = mszVar.g(8);
                mszVar.o(4);
                int iD2 = mszVar.d() + mszVar.g(12);
                String str = null;
                String str2 = null;
                while (mszVar.d() < iD2) {
                    int iG2 = mszVar.g(8);
                    int iG3 = mszVar.g(8);
                    int iD3 = mszVar.d() + iG3;
                    if (iG2 == 2) {
                        int iG4 = mszVar.g(16);
                        mszVar.o(8);
                        if (iG4 == 3) {
                            while (mszVar.d() < iD3) {
                                int iG5 = mszVar.g(8);
                                Charset charset = StandardCharsets.US_ASCII;
                                byte[] bArr = new byte[iG5];
                                mszVar.j(iG5, bArr);
                                str = new String(bArr, charset);
                                int iG6 = mszVar.g(8);
                                for (int i = 0; i < iG6; i++) {
                                    mszVar.p(mszVar.g(8));
                                }
                            }
                        }
                    } else if (iG2 == 21) {
                        Charset charset2 = StandardCharsets.US_ASCII;
                        byte[] bArr2 = new byte[iG3];
                        mszVar.j(iG3, bArr2);
                        str2 = new String(bArr2, charset2);
                    }
                    mszVar.m(iD3 * 8);
                }
                mszVar.m(iD2 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new wr0(iG, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new uov(arrayList);
            }
        }
        return null;
    }
}
