package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.externalgames.model.GamesMetadataResponse;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0082\u0001\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\nH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lc4h;", "", "", "sbCountry", "gameIds", "bizTypes", "categoryIds", "providerIds", "sortBy", "sortOrder", "", "limit", "offset", "Lcom/sportygames/commons/remote/model/HTTPResponse;", "", "Lcom/sportygames/externalgames/model/GamesMetadataResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILv1b;)Ljava/lang/Object;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c4h {
    @sbj("lobby/v1/games/metadata")
    Object a(@rhl("cookie") String str, @db30("gameIds") String str2, @db30("bizTypes") String str3, @db30("categoryIds") String str4, @db30("providerIds") String str5, @db30("sortBy") String str6, @db30("sortOrder") String str7, @db30("limit") int i, @db30("offset") int i2, v1b<? super HTTPResponse<List<GamesMetadataResponse>>> v1bVar);
}
