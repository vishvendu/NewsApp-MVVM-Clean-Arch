package com.vishvendu.cleanarch.newsapp.data.local.db;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.vishvendu.cleanarch.newsapp.data.local.db.dao.TopHeadlineDAO;
import com.vishvendu.cleanarch.newsapp.data.local.db.dao.TopHeadlineDAO_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsDataBase_Impl extends NewsDataBase {
  private volatile TopHeadlineDAO _topHeadlineDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `top_headline_table` (`title` TEXT NOT NULL, `author` TEXT, `content` TEXT, `description` TEXT, `publishedAt` TEXT, `sourceName` TEXT, `url` TEXT, `urlToImage` TEXT, PRIMARY KEY(`title`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `top_headline_response_table` (`topHeadlineArticles` TEXT NOT NULL, `status` TEXT NOT NULL, `totalResults` INTEGER NOT NULL, PRIMARY KEY(`topHeadlineArticles`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f99270364f5cc22cd678231056ddd65a')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `top_headline_table`");
        _db.execSQL("DROP TABLE IF EXISTS `top_headline_response_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTopHeadlineTable = new HashMap<String, TableInfo.Column>(8);
        _columnsTopHeadlineTable.put("title", new TableInfo.Column("title", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopHeadlineTable.put("author", new TableInfo.Column("author", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopHeadlineTable.put("content", new TableInfo.Column("content", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopHeadlineTable.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopHeadlineTable.put("publishedAt", new TableInfo.Column("publishedAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopHeadlineTable.put("sourceName", new TableInfo.Column("sourceName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopHeadlineTable.put("url", new TableInfo.Column("url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopHeadlineTable.put("urlToImage", new TableInfo.Column("urlToImage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTopHeadlineTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTopHeadlineTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTopHeadlineTable = new TableInfo("top_headline_table", _columnsTopHeadlineTable, _foreignKeysTopHeadlineTable, _indicesTopHeadlineTable);
        final TableInfo _existingTopHeadlineTable = TableInfo.read(_db, "top_headline_table");
        if (! _infoTopHeadlineTable.equals(_existingTopHeadlineTable)) {
          return new RoomOpenHelper.ValidationResult(false, "top_headline_table(com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle).\n"
                  + " Expected:\n" + _infoTopHeadlineTable + "\n"
                  + " Found:\n" + _existingTopHeadlineTable);
        }
        final HashMap<String, TableInfo.Column> _columnsTopHeadlineResponseTable = new HashMap<String, TableInfo.Column>(3);
        _columnsTopHeadlineResponseTable.put("topHeadlineArticles", new TableInfo.Column("topHeadlineArticles", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopHeadlineResponseTable.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopHeadlineResponseTable.put("totalResults", new TableInfo.Column("totalResults", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTopHeadlineResponseTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTopHeadlineResponseTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTopHeadlineResponseTable = new TableInfo("top_headline_response_table", _columnsTopHeadlineResponseTable, _foreignKeysTopHeadlineResponseTable, _indicesTopHeadlineResponseTable);
        final TableInfo _existingTopHeadlineResponseTable = TableInfo.read(_db, "top_headline_response_table");
        if (! _infoTopHeadlineResponseTable.equals(_existingTopHeadlineResponseTable)) {
          return new RoomOpenHelper.ValidationResult(false, "top_headline_response_table(com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlinesResponse).\n"
                  + " Expected:\n" + _infoTopHeadlineResponseTable + "\n"
                  + " Found:\n" + _existingTopHeadlineResponseTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "f99270364f5cc22cd678231056ddd65a", "6141a35500ea468fd99e7d0b3c921883");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "top_headline_table","top_headline_response_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `top_headline_table`");
      _db.execSQL("DELETE FROM `top_headline_response_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(TopHeadlineDAO.class, TopHeadlineDAO_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public TopHeadlineDAO topHeadlineDAO() {
    if (_topHeadlineDAO != null) {
      return _topHeadlineDAO;
    } else {
      synchronized(this) {
        if(_topHeadlineDAO == null) {
          _topHeadlineDAO = new TopHeadlineDAO_Impl(this);
        }
        return _topHeadlineDAO;
      }
    }
  }
}
