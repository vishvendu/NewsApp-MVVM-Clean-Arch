package com.vishvendu.cleanarch.newsapp.data.local.db.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TopHeadlineDAO_Impl implements TopHeadlineDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TopHeadlineArticle> __insertionAdapterOfTopHeadlineArticle;

  private final EntityDeletionOrUpdateAdapter<TopHeadlineArticle> __updateAdapterOfTopHeadlineArticle;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllTopHeadline;

  public TopHeadlineDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTopHeadlineArticle = new EntityInsertionAdapter<TopHeadlineArticle>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `top_headline_table` (`title`,`author`,`content`,`description`,`publishedAt`,`sourceName`,`url`,`urlToImage`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TopHeadlineArticle value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
        if (value.getAuthor() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAuthor());
        }
        if (value.getContent() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getContent());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getPublishedAt() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPublishedAt());
        }
        if (value.getSourceName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSourceName());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUrl());
        }
        if (value.getUrlToImage() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getUrlToImage());
        }
      }
    };
    this.__updateAdapterOfTopHeadlineArticle = new EntityDeletionOrUpdateAdapter<TopHeadlineArticle>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `top_headline_table` SET `title` = ?,`author` = ?,`content` = ?,`description` = ?,`publishedAt` = ?,`sourceName` = ?,`url` = ?,`urlToImage` = ? WHERE `title` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TopHeadlineArticle value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
        if (value.getAuthor() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAuthor());
        }
        if (value.getContent() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getContent());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getPublishedAt() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPublishedAt());
        }
        if (value.getSourceName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSourceName());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUrl());
        }
        if (value.getUrlToImage() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getUrlToImage());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTitle());
        }
      }
    };
    this.__preparedStmtOfDeleteAllTopHeadline = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from top_headline_table";
        return _query;
      }
    };
  }

  @Override
  public void insert(final List<TopHeadlineArticle> topHeadlineArticle) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTopHeadlineArticle.insert(topHeadlineArticle);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object update(final TopHeadlineArticle topHeadlineArticle,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfTopHeadlineArticle.handle(topHeadlineArticle);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void deleteAllTopHeadline() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllTopHeadline.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllTopHeadline.release(_stmt);
    }
  }

  @Override
  public Flow<List<TopHeadlineArticle>> getAllTopHeadlineFlow() {
    final String _sql = "select * from top_headline_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"top_headline_table"}, new Callable<List<TopHeadlineArticle>>() {
      @Override
      public List<TopHeadlineArticle> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPublishedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "publishedAt");
          final int _cursorIndexOfSourceName = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceName");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfUrlToImage = CursorUtil.getColumnIndexOrThrow(_cursor, "urlToImage");
          final List<TopHeadlineArticle> _result = new ArrayList<TopHeadlineArticle>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TopHeadlineArticle _item;
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpAuthor;
            if (_cursor.isNull(_cursorIndexOfAuthor)) {
              _tmpAuthor = null;
            } else {
              _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
            }
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpPublishedAt;
            if (_cursor.isNull(_cursorIndexOfPublishedAt)) {
              _tmpPublishedAt = null;
            } else {
              _tmpPublishedAt = _cursor.getString(_cursorIndexOfPublishedAt);
            }
            final String _tmpSourceName;
            if (_cursor.isNull(_cursorIndexOfSourceName)) {
              _tmpSourceName = null;
            } else {
              _tmpSourceName = _cursor.getString(_cursorIndexOfSourceName);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpUrlToImage;
            if (_cursor.isNull(_cursorIndexOfUrlToImage)) {
              _tmpUrlToImage = null;
            } else {
              _tmpUrlToImage = _cursor.getString(_cursorIndexOfUrlToImage);
            }
            _item = new TopHeadlineArticle(_tmpTitle,_tmpAuthor,_tmpContent,_tmpDescription,_tmpPublishedAt,_tmpSourceName,_tmpUrl,_tmpUrlToImage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<TopHeadlineArticle> getAllTopHeadline() {
    final String _sql = "select * from top_headline_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
      final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfPublishedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "publishedAt");
      final int _cursorIndexOfSourceName = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceName");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfUrlToImage = CursorUtil.getColumnIndexOrThrow(_cursor, "urlToImage");
      final List<TopHeadlineArticle> _result = new ArrayList<TopHeadlineArticle>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TopHeadlineArticle _item;
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpAuthor;
        if (_cursor.isNull(_cursorIndexOfAuthor)) {
          _tmpAuthor = null;
        } else {
          _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
        }
        final String _tmpContent;
        if (_cursor.isNull(_cursorIndexOfContent)) {
          _tmpContent = null;
        } else {
          _tmpContent = _cursor.getString(_cursorIndexOfContent);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpPublishedAt;
        if (_cursor.isNull(_cursorIndexOfPublishedAt)) {
          _tmpPublishedAt = null;
        } else {
          _tmpPublishedAt = _cursor.getString(_cursorIndexOfPublishedAt);
        }
        final String _tmpSourceName;
        if (_cursor.isNull(_cursorIndexOfSourceName)) {
          _tmpSourceName = null;
        } else {
          _tmpSourceName = _cursor.getString(_cursorIndexOfSourceName);
        }
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        final String _tmpUrlToImage;
        if (_cursor.isNull(_cursorIndexOfUrlToImage)) {
          _tmpUrlToImage = null;
        } else {
          _tmpUrlToImage = _cursor.getString(_cursorIndexOfUrlToImage);
        }
        _item = new TopHeadlineArticle(_tmpTitle,_tmpAuthor,_tmpContent,_tmpDescription,_tmpPublishedAt,_tmpSourceName,_tmpUrl,_tmpUrlToImage);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
